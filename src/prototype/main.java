package prototype;

import builderDP.Student;

public class main {
    public static void main(String[] args) {
        student s = new student();
        s.name="karan";
        s.batch="abc";
        student s2 = s.copy();
        student s3 = s.copy();

        InStudent is = new InStudent();
        is.name="abc";
        is.psp=10;
        is.batch="mno";
        student is1 = is.copy();

        System.out.println("debug");

    }
}
