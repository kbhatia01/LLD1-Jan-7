package Factory;

public class Android extends platform{

    public UiComponentFactory getFactory(){
        return new AndroidUiComponentFactory();
    }

}
