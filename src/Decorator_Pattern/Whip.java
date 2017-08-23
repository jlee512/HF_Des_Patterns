package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
