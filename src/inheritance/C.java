package inheritance;

public class C extends B{
    C(String data){
        System.out.println(data);
    }

    void doSomething(){
        System.out.println("Something");
    }

    // Same signature
//    int doSomething(){
//        System.out.println("Something");
//        return 0;
//    }

    void doSomething(String abc){
        System.out.println("Something: " + abc);
    }

    void doSomething(int a, String abc){
        System.out.println("Something: "+ a + abc);
    }

    void doSomething(String abc, int a){
        System.out.println("Something: " + abc + a);
    }




}
