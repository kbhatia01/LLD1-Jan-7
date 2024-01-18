package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;
    Adder(Value v){
        this.v = v;
    }
    public Void call(){
        for (int i = 0; i < 50000; i++) {
            this.v.val +=1;
        }
        return null;
    }
}
