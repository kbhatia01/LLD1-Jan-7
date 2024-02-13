package prototype;

import inheritance.Students;

public class student implements Prototype<student>{
    int age;
    String batch;
    String name;

    student(){

    }
    student(student s){
        this.age=s.age;
        this.name=s.name;
        this.batch=s.batch;
    }

    @Override
    public student copy() {

        student s1 = new student(this);

        return s1;
    }
}
