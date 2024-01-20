package producerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    public int maxShelfs;
    private ConcurrentLinkedQueue<Object> items;

    Store(int maxShelfs){
        this.maxShelfs = maxShelfs;
        items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxShelfs() {
        return maxShelfs;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public  void addItem(){
        System.out.println("Producer size is :"+ this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("consumer size is :"+ this.items.size());

        this.items.remove();
    }



}
