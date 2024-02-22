package Weather;

public class AvgDisplay implements Observer, Display{

    private float temp;

    private float humidity;

    private Subject sub;

    AvgDisplay(Subject sub){
        this.sub = sub;

        sub.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg Temp: " + temp + ", Avg Humidity: "+
                humidity);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
