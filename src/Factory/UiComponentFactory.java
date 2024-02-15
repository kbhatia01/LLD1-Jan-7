package Factory;

import Factory.component.Menu.Menu;
import Factory.component.button.Button;

public interface UiComponentFactory {

    public Button CreateButton();
    public Menu CreateMenu();

}
