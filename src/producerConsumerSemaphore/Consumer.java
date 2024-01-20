package producerConsumerSemaphore;


import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore psema, cSema;
    Consumer(Store st, Semaphore producerSema, Semaphore conSumerSema){
        store =st;
        this.psema = producerSema;
        this.cSema = conSumerSema;
    }

    public void run(){
        while (true){
            try {
                this.cSema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            this.psema.release();

        }
    }

}
