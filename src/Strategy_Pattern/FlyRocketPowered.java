package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
