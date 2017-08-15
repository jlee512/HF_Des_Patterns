package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard_duck = new Mallard_Duck();

        mallard_duck.display();
        mallard_duck.performQuack();
        mallard_duck.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

    }

}
