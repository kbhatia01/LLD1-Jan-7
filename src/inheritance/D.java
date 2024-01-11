package inheritance;

public class D extends C implements Running{
    D(){
        super("My parent is C");
        System.out.println("D");
    }

    // over ridding..
    void doSomething(){
        System.out.println("Class D's do something");
    }
    // error: as signature changed
//    String doSomething(){
//        System.out.println("Class D's do something");
//    }
    public void run(){
        System.out.println("Running");

    }

}
