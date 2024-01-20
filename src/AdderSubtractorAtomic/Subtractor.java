package AdderSubtractorAtomic;



import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value v;
    private Lock l;

    Subtractor(Value v, Lock l){
        this.v = v;
        this.l = l;
    }

    public Void call() throws Exception {
//        this.l.lock();
        for (int i = 0; i < 100; i++) {
//            l.lock();
            System.out.println("Lock acquired by Sub "+i);
            this.v.val.addAndGet(-1);
//            l.unlock();


        }
//        this.l.unlock();

        return null;
    }
}
