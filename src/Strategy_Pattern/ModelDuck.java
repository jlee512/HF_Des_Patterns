package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class ModelDuck extends Duck {

    //Default behaviour, to be overrun at runtime (for Rocket Power!)
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
