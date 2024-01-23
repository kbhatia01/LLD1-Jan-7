package generics;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        pair<String, Integer>  p = new pair<>();
//        p.setX("10");
//        p.setY(10);
        pair.doSomething("abc", 10.00);

        p.doSomething2("",10);

//        HashMap<Integer, String> h= new HashMap<>();
////        h.put("val", 10);
//        h.put(10, "10");


        // raw data type,  prone to runtime errors:
        pair p1 = new pair();
        p1.setY("abc");
        p1.setY(01);








        System.out.println("Debug");

    }
}
