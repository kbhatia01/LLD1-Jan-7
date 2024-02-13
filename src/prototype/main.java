package prototype;

import builderDP.Student;

public class main {

    public static void fillReistry(studentRegistry s1){
        InStudent i1 = new InStudent();
        s1.register("Intelligent", i1);
        student s = new student();
        s.batch="A";
        s1.register("batch_A_Student",s);

    }
    public static void main(String[] args) {
        studentRegistry s1 = new studentRegistry();
        fillReistry(s1);

//        student s = new student();
//        s.name="karan";
//        student s2 = s.copy();
//        student s3 = s.copy();
//        student s4 = s.copy();
//        InStudent is = new InStudent();
//        is.name="abc";
//        is.psp=10;
//        is.batch="mno";
//        student is1 = is.copy();

        student bqtchACopy = s1.get("batch_A_Student");
        student bqtchACopy2 = s1.get("Intelligent");


        System.out.println("debug");

    }
}
