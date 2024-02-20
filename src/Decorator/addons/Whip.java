package Decorator.addons;

import Decorator.Beverage;

public class Whip implements Addon{

    Beverage b;

    public Whip(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return 70 + b.getPrice();
    }
}
