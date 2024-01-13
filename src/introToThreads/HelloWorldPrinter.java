package introToThreads;

public class HelloWorldPrinter implements Runnable{

    public void doSomething(){
        System.out.println("do Something form: " + Thread.currentThread().getName());
    }
    public void run(){
        System.out.println("Helloworld form: " + Thread.currentThread().getName());
        doSomething();
    }
}
