package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public class Espresso extends Beverage {

    public Espresso () {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
