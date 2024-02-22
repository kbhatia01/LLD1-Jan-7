package Weather;

public class Main {
    public static void main(String[] args) {
        weatherData w = new weatherData();

        currentDisplay d = new currentDisplay(w);
        AvgDisplay a = new AvgDisplay(w);


        w.setMeasurements(10,20);
        w.setMeasurements(11,15);

        d.deregister();
        w.setMeasurements(11,15);
    }
}
