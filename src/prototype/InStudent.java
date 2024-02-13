package prototype;

import builderDP.Student;

public class InStudent extends student
        implements Prototype<student>{

    int psp;

    int rank;

    @Override
    public InStudent copy() {
        student i1 = super.copy();
        i1.name = this.name;
        i1.psp=this.psp;
        i1.rank=this.rank;
        i1.age=20;
        i1.batch=this.batch;
        return i1;
    }
}
