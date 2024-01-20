package producerConsumerSemaphore;


import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store store;
    private Semaphore psema, cSema;

    Producer(Store st, Semaphore producerSema, Semaphore conSumerSema){
        this.psema = producerSema;
        this.cSema = conSumerSema;
        this.store =st;
    }

    public void run(){
        while (true){
            try {
                this.psema.acquire();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            this.cSema.release();

        }
    }

}
