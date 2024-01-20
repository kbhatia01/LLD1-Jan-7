package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        Store s = new Store(5);

        for (int i = 0; i < 8; i++) {
            es.execute(new Producer(s));
        }

        for (int i = 0; i < 20; i++) {
            es.execute(new Consumer(s));
        }

    }
}
