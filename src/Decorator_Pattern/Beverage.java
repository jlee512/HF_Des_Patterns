package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
