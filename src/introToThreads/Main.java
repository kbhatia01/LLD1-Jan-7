package introToThreads;

public class Main {
    public static void main(String[] args) {
//        HelloWorldPrinter hw = new HelloWorldPrinter();
//        hw.run();
//        Thread t = new Thread(hw);
//        t.start();
        System.out.println("Current Thread: "+ Thread.currentThread().getName());

        for(int i=0; i<=100; i++){
            Runnable pn = new PrintNumber(i);
            Thread t1 = new Thread(pn);
            t1.start();
        }
    }

}
