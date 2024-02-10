package builderDP;

import java.util.Objects;

public class Student {
    String name;
    int id;
    double psp;
    int age;
    int gradYear;

    String email;

    public Student(StudentHelper h){

        this.age=h.age;
        this.id=h.id;
        this.email = h.email;
        this.psp=h.psp;
        if(h.gradYear != 0){
            this.gradYear= h.gradYear;
        }
        this.name=h.name;

    }
// GO WITH NESTED CLASS IF YOU WANT PRIVATE CONSTRUCTOR
//    static StudentHelper getInstance(){
//        return new StudentHelper();
//    }
//
//    static class StudentHelper {
//        String name;
//        int id;
//        double psp;
//        int age;
//        int gradYear;
//
//        String email;
//
//        public double getPsp() {
//            return psp;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public int getGradYear() {
//            return gradYear;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public StudentHelper setAge(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public StudentHelper setEmail(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public void setGradYear(int gradYear) {
//            this.gradYear = gradYear;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public StudentHelper setPsp(double psp) {
//            this.psp = psp;
//            return this;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Student build() {
//
//            if(this.age<10){
//                throw  new IllegalArgumentException("age can't be less than 10");
//            }
//
//            if(Objects.equals(this.getEmail(), "")){
//                throw  new IllegalArgumentException();
//            }
//            return new Student(this);
//        }
//    }



    }
