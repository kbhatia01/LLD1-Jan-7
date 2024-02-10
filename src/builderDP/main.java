package builderDP;

import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {




        // error prone is not set in chains..
//        StudentHelper h2 = new StudentHelper();
//                h2.setAge(-1);


//        Student s = h.build();
//        StudentHelper h2 = new StudentHelper();
//        Student s2 = new Student(h2);

//        h2.setEmail("abc@gmail.com");
//        h2.setPsp(10.00);
//        h2.setAge(100);

//        Student h = Student.getInstance()
//                .setAge(11)
//                .setEmail("abc@gmail.com")
//                .setPsp(10.00).build();

//        Student s1 = new Student(h); HOW TO STOP THIS?



        Student h = new StudentHelper().setAge(11)
                .setEmail("abc@gmail.com")
                .setPsp(10.00).build();


        System.out.println("break");


    }

}
