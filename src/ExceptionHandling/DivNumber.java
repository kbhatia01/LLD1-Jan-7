package ExceptionHandling;

import javax.management.openmbean.InvalidKeyException;

public class DivNumber {

    public int doSomething(int a, int b) throws NumberNotAllowed{
        if (b==0){
            throw new NumberNotAllowed();
        }
        return a/b;
    }

    public void findStdByRollNo(int no) throws ClassNotFoundException,NumberNotAllowed {
        if(no < 0){
            throw new ClassNotFoundException();
        }
        if (no%2==0){
            throw new NumberNotAllowed();
        }
        System.out.println("Roll no: " + no);
        return;
    }

    void rec(int a){
        rec(a*a);
    }
}
