package builderDP;

public class StudentHelper {
    String name;
    int id;
    double psp;
    int age;
    int gradYear;

    String email;

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public StudentHelper setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentHelper setEmail(String email) {
        this.email = email;
        return this;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentHelper setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student build(){
        // do validations here..
        return new Student(this);
    }

}
