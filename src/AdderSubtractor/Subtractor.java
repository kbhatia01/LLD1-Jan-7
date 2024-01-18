package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Value v;

    Subtractor(Value v){
        this.v = v;
    }

    public Void call() throws Exception {
        for (int i = 0; i < 50000; i++) {
            this.v.val -=1;
        }
        return null;
    }
}
