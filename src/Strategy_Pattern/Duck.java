package Strategy_Pattern;

/**
 * Created by Julian on 16/08/2017.
 */
public abstract class Duck {

    //Interface type declaration which will be used to define behaviour
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){
    }

    public abstract void display();

    //Generic implementation of flyBehaviour
    public void performFly() {
        flyBehaviour.fly();
    }

    //Generic implementation of quackBehaviour
    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    //Allow flyBehaviour to be set at run-time
    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    //Allow quackBehaviour to be set at run-time
    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }
}
