package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(10);
        s1.add(4);
        s1.add(10);
        s1.add(-1);
        s1.add(-15);
        s1.add(20);
        s1.add(null);
        s1.add(null);
        for(Integer i : s1){
            System.out.println(i);
        }
    Set<String> s2 = new TreeSet<>();
        s2.add("Narasimhulu");
        s2.add("Neelakshi");
        s2.add("Vashkar");
        s2.add("Deepak");
        s2.add("Priyamvad");
        s2.add("Jeevan");
        for(String s : s2){
            System.out.println(s);
        }

        Set<Student> s3 = new TreeSet<>();
        for(int i=0;i<5;i++){
            Student s = new Student(i, "Name"+i, i*10);
            s3.add(s);
        }
        for(Student s : s3){
            System.out.println(s.id);
        }

        Set<Student> s4 = new TreeSet<>(new StudentOrdering());
        for(int i=0;i<5;i++){
            Student s = new Student(i, "Name"+i, i*10);
            s4.add(s);
        }

        StudentOrdering ss =  new StudentOrdering();
        for(Student s : s4){
            System.out.println(s.psp);
        }

        Set<String> s5 = new LinkedHashSet<>();
        s5.add("Narasimhulu");
        s5.add("Neelakshi");
        s5.add("Vashkar");
        s5.add("Deepak");
        s5.add("Priyamvad");
        s5.add("Jeevan");
        s5.add("Vashkar");

        for(String s : s5){
            System.out.println(s);
        }

        Payments p = new Payments();
        p.status = PaymentStatus.PENDING;

        Set<PaymentStatus> values = EnumSet.allOf(PaymentStatus.class);

        for( PaymentStatus p1: values){
            System.out.println(p1);
        }


        Queue<String> q = new PriorityQueue<>();
        q.add("Narasimhulu");
        q.add("Neelakshi");
        q.add("Vashkar");
        q.add("Deepak");
        q.add("Priyamvad");
        q.add("Jeevan");
        q.add("Vashkar");

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        Queue<Student> q2 = new PriorityQueue<>(ss);


        for(int i=0;i<5;i++){
            Student s = new Student(i, "Name"+i, i*10);
            q2.add(s);
        }

        while (!q2.isEmpty()){
            System.out.println(q2.poll().psp);
        }

        List<Student> sList = new ArrayList<>();
        for(int i=0;i<5;i++){
            Student s = new Student(i, "Name"+i, i*10);
            sList.add(s);
        }
        Collections.sort(sList);

        for (Student s: sList
             ) {
            System.out.println(s.psp);
        }

        Queue<Student> q3 = new PriorityQueue<>((std1,std2)->{
            if(std1.psp <std2.psp){
                return -1;
            } else if (std1.psp > std2.psp) {
                return 1;
            }
            return 0;
        });
        for(int i=0;i<5;i++){
            Student s = new Student(i, "Name"+i, i*10);
            q3.add(s);
        }
        System.out.println("Printing Lambda expression Pq");

        for (Student s: q3) {
            System.out.println(s.psp);
        }


    }
}
