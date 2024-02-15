package Factory;

import Factory.component.button.AndroidButton;
import Factory.component.button.Button;

public class main {

    public static void main(String[] args) {

        platform p = new Android();

        UiComponentFactory f = p.getFactory("Android");

        Button b = f.CreateButton();

        b.click();
    }

}
