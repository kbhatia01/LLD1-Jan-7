package abstractClasses;

import inheritance.D;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(Dog.y); // 11

        Dog d = new Dog();

        System.out.println(Dog.y); // 12

        BullDog bd = new BullDog();
        BullDog.doSomething();

        Dog d1 = new Dog();
        Dog.doSomething();


        //final:
//        once initialized, cant be changed
//     // final method:
//             can't be overridden by child...

//         // final class
//            // can't extend the final class



    }
}
