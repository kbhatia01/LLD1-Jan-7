package Decorator.addons;

import Decorator.Beverage;

public class Milk implements Addon{

    Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return 20 + b.getPrice();
    }
}
