package abstractClasses;


//public final abstract class Animal {, final can't be inherited..

public abstract class Animal {
    String name;
    int age;
    String color;

    void printName(){
        System.out.println(name);
    }

    abstract void eat();

    Animal(){
        this.name = "name";
        this.age = 10;
        this.color="Red";
    }


}
