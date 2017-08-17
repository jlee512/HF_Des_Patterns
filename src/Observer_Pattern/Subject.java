package Observer_Pattern;

/**
 * Created by Julian on 17/08/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
