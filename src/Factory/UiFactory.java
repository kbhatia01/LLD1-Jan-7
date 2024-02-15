package Factory;

public class UiFactory {
    public static UiComponentFactory decideFactory(String platform){
        if(platform.equals("Android")){
            return new AndroidUiComponentFactory();
        } else if (platform.equals("Web")) {
            return null;
        } else return new IosUiComponentFactory();
    }
}
