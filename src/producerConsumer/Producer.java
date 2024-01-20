package producerConsumer;

public class Producer implements Runnable{

    private Store store;

    Producer(Store st){
        this.store =st;
    }

    public void run(){
        while (true){
            synchronized (store){
            if (store.getItems().size()<store.getMaxShelfs()) {
                store.addItem();
                }
            }
        }
    }

}
