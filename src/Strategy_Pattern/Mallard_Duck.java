package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class Mallard_Duck extends Duck {

    Mallard_Duck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }


}
