package Collections;

import java.util.Comparator;

public class StudentOrdering implements Comparator<Student> {

    public int compare(Student s1, Student s2){
        if(s1.psp <s2.psp){
            return -1;
        } else if (s1.psp > s2.psp) {
            return 1;
        }
        return 0;

    }

}
