package Factory;

public class platform {
    void setTheme(){

    }
    public UiComponentFactory getFactory(String platform){
        return UiFactory.decideFactory(platform);
    }

}
