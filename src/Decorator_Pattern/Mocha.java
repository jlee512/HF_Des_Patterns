package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public class Mocha extends CondimentDecorator {
    //Instantiate a decorator with a reference to a particular Beverage
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    //The following methods are called as an extension to the original 'Beverage' methods (i.e. it decorates/adds to those methods)
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
