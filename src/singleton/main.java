package singleton;

public class main {
    public static void main(String[] args) {
        dbconn d1 = dbconn.getInstance();
        dbconn d2 = dbconn.getInstance();

        d1.increment_c();
        d2.increment_c();
        System.out.println(d2.getC());


        // create multiple threads and run this increment_c func....

    }
}
