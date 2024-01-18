package AdderSubtractorMutex;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        System.out.println(v.val);
        Adder x = new Adder(v, l);
        Subtractor s = new Subtractor(v, l);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(x);
        Future<Void> subFuture = es.submit(s);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);



    }
}
