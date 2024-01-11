package abstractClasses;

public class Dog extends Animal{
     public static int y=10;
     int z = 11;

     final int m = 15;

    void eat(){
        System.out.println("eat");
        System.out.println(z);
        System.out.println(y);
        System.out.println(m * 20);
//        m += 20; won't work as final cant be assigned.

    }

    static void doSomething(){
        Dog d = new Dog();
        System.out.println("Something");
//        System.out.println(z); Non static: linked to object..
    }

    final void doSomethingFinal(){
        System.out.println("Something");
//        System.out.println(z); Non static: linked to object..
    }
    Dog(){
        y+=1;
    }
}
