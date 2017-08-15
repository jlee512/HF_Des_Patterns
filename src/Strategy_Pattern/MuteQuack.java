package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
