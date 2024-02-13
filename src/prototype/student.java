package prototype;

import inheritance.Students;

public class student implements Prototype<student>{
    int age;
    String batch;
    String name;
    @Override
    public student copy() {

        student s1 = new student();
        s1.age=this.age;
        s1.name=this.name;
        s1.batch=this.batch;
        return s1;
    }
}
