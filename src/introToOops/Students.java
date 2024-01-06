package introToOops;

public class Students {
    public String name;
    int phoneNumber;
    private int age;
    protected double psp;
    String batchName = "A";

    Instuctor i;

    Students(String name, int age, double psp){
        this.name = name;
        this.age = age;
        this.psp=psp;
        this.i = new Instuctor(1);
    }

    Students(Students oldStudent){
        this.name = new StringBuilder(oldStudent.name).toString();
        this.psp = oldStudent.psp;
        this.age= oldStudent.age;
        this.i = new Instuctor(oldStudent.i);
        this.batchName = oldStudent.batchName;
    }

    void changeBatch(String newBatchName){
        batchName =  newBatchName;
    }

    void giveMockInterview(){
        System.out.println(name + " Giving Mock Interview");
    }

    int getAge(){
        return age;
    }
    void setAge(int new_age){
        age = new_age;
    }
}
