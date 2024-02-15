package Factory;

import Factory.component.Menu.AndroidMenu;
import Factory.component.Menu.Menu;
import Factory.component.button.AndroidButton;
import Factory.component.button.Button;

public class AndroidUiComponentFactory implements UiComponentFactory{

    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }
}
