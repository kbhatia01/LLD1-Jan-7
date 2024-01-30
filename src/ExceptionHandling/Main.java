package ExceptionHandling;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        DivNumber dos = new DivNumber();
        System.out.println("Something Went wrong");
        try {
            dos.doSomething(1, 1); // deducting amount from you
            dos.findStdByRollNo(1); // sending amount to me...
            System.out.println("Something Went wrong 3");

            // db.close();

        }catch (ClassNotFoundException ex){
            System.out.println("class not found");
            throw new FileNotFoundException();

            // db.close();
        }
        catch (NumberNotAllowed ex){
            System.out.println("Not allowd occured: " + ex);

            //db.close();
        } finally {
            System.out.println("db closed");
        }


        dos.rec(2);






//         A -> B-> C -> D
//         catch(D,C,B,A..

        System.out.println("Something Went wrong 2");

//         Animal a = new Dog();
    }

}
