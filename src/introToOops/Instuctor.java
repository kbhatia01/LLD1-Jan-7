package introToOops;

public class Instuctor {
    int id;

    Instuctor(int id){
        this.id = id;
    }

    Instuctor(Instuctor oldInst){
        this.id = oldInst.id;
    }
}
