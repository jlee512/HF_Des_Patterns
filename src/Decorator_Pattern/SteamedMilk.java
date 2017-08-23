package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    //Decorator methods
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamed-milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
