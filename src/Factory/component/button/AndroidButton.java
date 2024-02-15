package Factory.component.button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicking AndroidButton");
    }
}