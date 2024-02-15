package Factory;

public class Ios extends platform{

    public UiComponentFactory getFactory(){
        return new IosUiComponentFactory();
    }
}
