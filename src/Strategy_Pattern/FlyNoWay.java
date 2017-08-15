package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
