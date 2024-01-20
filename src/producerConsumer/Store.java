package producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    public int maxShelfs;
    private List<Object> items;

    Store(int maxShelfs){
        this.maxShelfs = maxShelfs;
        items = new ArrayList<>();
    }

    public int getMaxShelfs() {
        return maxShelfs;
    }

    public List<Object> getItems() {
        return items;
    }

    public  void addItem(){
        System.out.println("Producer size is :"+ this.items.size());
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("consumer size is :"+ this.items.size());

        this.items.remove(this.items.size()-1);
    }



}
