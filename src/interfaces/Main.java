package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<inter> paricipents = new LinkedList();
        Bat c = new Bat();
        Dog d = new Dog();
        paricipents.add(d);
        for (inter a: paricipents) {
            a.run();

        }
    }
}
