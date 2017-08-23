package Decorator_Pattern;

/**
 * Created by Julian on 23/08/2017.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
