package Collections;

public class Student implements Comparable<Student>{
    int id;
    String name;
    double psp;

    Student(int id, String name, double psp){
        this.id = id;
        this.name = name;
        this.psp = psp;
    }

    public int compareTo(Student otherStudent){
        if(this.id == otherStudent.id){
            return 0;
        }
        if(this.id<otherStudent.id){
            return 1;
        }
        return -1;
    }


}
