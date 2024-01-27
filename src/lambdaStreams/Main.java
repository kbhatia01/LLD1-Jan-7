package lambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Way -1
        Runnable l  = new lamdas();
        Thread t = new Thread(l);
        t.start();

//        way 2 as lambda expression
//        need not to create a class and implement function
        Runnable r = () -> {
            System.out.println("in lambda expression");
        };

        Thread t2 = new Thread(r);
        t2.start();

//        way 3

        Runnable r2 = () -> System.out.println("in lambda expression without {}");

        Thread t3 = new Thread(r2);
        t3.start();

        List<Integer> listx = new ArrayList<>();
        listx.add(11);
        listx.add(16);
        listx.add(4);
        listx.add(9);
        listx.add(-1);

        // Intermidiate : Filter, MAP
        // terminal    : forEach
        Stream<Integer> s = listx.stream();
        s.forEach((elm)-> System.out.println(elm));

        // new stream to filter and print the data..
        Stream<Integer> s2 = listx.stream();

        s2.filter((elm)->{
            System.out.println("filtering: "+ elm);
            return elm %2==0;
        }).forEach((elm)-> System.out.println("printing "+ elm));


//        for (Integer x: listx) {
//            if(x%2==0){
//                System.out.println(x);
//            }
//
//        }

        Stream<Integer> s3 = listx.stream();
        s3.filter((elm)->{
            System.out.println("filtering s3: "+ elm);
            return elm %2==0;
        }).sorted((obj1,obj2)->{
            System.out.println("Sorting 3:" + obj1 +" " + obj2);
            if(obj1 <obj2){
                return -1;
            } else if (obj1 >obj2) {
                return 1;
            }
            return 0;
        }).forEach((elm)-> System.out.println("printing "+ elm));



        // MAPS:

        Stream<Integer> s4 = listx.stream();

        s4.map(elm->elm+5)
                .filter((elm)->{
            System.out.println("filtering s4: "+ elm);
            return elm %2==0;
        }).sorted((obj1,obj2)->{
            System.out.println("Sorting 3:" + obj1 +" " + obj2);
            if(obj1 == (obj2)){
                return 0;
            } else if (obj1<(obj2)) {
                return 1;
            }
            return -1;
        }).map((elm)->{
            System.out.println("map s4: "+ elm);
            return elm+ "HI";
        }).forEach((elm)->{
            System.out.println("elemets are s4: "+ elm);
        });

        Stream<Integer> s5 = listx.stream();
        List<String> ans = s5.filter((elm)-> {
                    System.out.println("filtering s4: " + elm);
                    return elm % 2 == 0;
             }).map((elm)->  elm+ "HI").collect(Collectors.toList());

        for (String val: ans) {
            System.out.println("Printing s5: "+ val);
        }

        Stream<Integer> s6 = listx.stream();

        Optional<String> ans2 = s6.filter((elm)-> {
            System.out.println("filtering s4: " + elm);
            return elm % 2 == 0;
        }).map((elm)->  elm+ "HI").findFirst();

        if(ans2.isPresent()){
            System.out.println("Final Value:" +ans2.get());
        }

        // REDUCE:
//        List<Integer> list2 = new ArrayList<>();

        Stream<Integer> s7 = listx.stream();

        Integer value = s7.filter((elm)-> {
            System.out.println("filtering s4: " + elm);
            return elm % 2 == 0;
        }).reduce((num1, num2)->num1*num2).orElse(-1);

        System.out.println("reduced value is :" + value);

        Stream<Integer> s8 = listx.stream();

        Integer values = s8.filter((elm)-> {
            System.out.println("filtering s4: " + elm);
            return elm % 2 == 0;
        }).reduce((OldMaxValue,num2)->Math.max(num2, OldMaxValue)).orElse(-1);

        System.out.println("reduced value is :" + values);

        Stream<Integer> s9 = listx.stream();

        Integer values2 = s9.filter((elm)-> {
            System.out.println("filtering s4: " + elm);
            return elm % 2 == 0;
        }).reduce(Integer::max).orElse(-1);
        System.out.println("reduced value is :" + values2);



    }
}
