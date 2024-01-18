package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        System.out.println(v.val);
        Adder x = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(x);
        Future<Void> subFuture = es.submit(s);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);



    }
}
