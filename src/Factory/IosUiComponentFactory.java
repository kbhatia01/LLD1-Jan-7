package Factory;

import Factory.component.Menu.IosMenu;
import Factory.component.Menu.Menu;
import Factory.component.button.Button;
import Factory.component.button.IosButton;

public class IosUiComponentFactory implements UiComponentFactory{
    @Override
    public Button CreateButton() {
        return new IosButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IosMenu();
    }
}
