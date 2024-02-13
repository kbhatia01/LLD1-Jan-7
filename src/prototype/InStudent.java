package prototype;

public class InStudent extends student
        implements Prototype<student>{

    int psp;

    int rank;

    InStudent(){

    }
    InStudent(InStudent is){
        super(is);
        this.psp=is.psp;
        this.rank=is.rank;
    }
    @Override
    public InStudent copy() {
        InStudent i1 = new InStudent(this);
        return i1;
    }
}
