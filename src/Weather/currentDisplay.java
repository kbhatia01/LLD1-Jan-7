package Weather;

public class currentDisplay implements Observer, Display{
    private float temp;
    private float humidity;

    private Subject sub;

    currentDisplay(Subject sub){
        this.sub = sub;

        sub.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Temp: " + temp + ", Current Humidity: "+
                humidity);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }

    public void deregister(){
        this.sub.removeObserver(this);
    }
}
