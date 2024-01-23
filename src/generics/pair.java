package generics;

public class pair <Vs,Ss> {
    Vs x;
    Ss y;

    public void setX(Vs x){
        this.x = x;
    }
    public void setY(Ss y){
        this.y = y;
    }

    public Ss getY() {
        return y;
    }

    public static <s,v> void doSomething(v x, s Y){

        System.out.println("hey");
    }

    public <v,s> void doSomething2(v x, s Y){

        System.out.println("hey");
    }




}
