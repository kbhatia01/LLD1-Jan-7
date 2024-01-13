package introToThreads;

public class PrintNumber implements Runnable{

    private int num;
    PrintNumber(int number){
        this.num = number;
    }
    public void run(){
        System.out.println("Printing number "+ this.num + " : " +
                Thread.currentThread().getName());


    }
}
