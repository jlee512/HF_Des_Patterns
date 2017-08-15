package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm Flying!");
    }
}
