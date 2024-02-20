package Decorator;

import Decorator.addons.Addon;

public class Espresso implements Beverage{
    @Override
    public int getPrice() {
        return 80;

    }
}
