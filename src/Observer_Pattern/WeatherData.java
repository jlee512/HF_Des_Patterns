package Observer_Pattern;

import java.util.ArrayList;

/**
 * Created by Julian on 17/08/2017.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    //For adding new observers ('Subscribing')
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //For remove observers ('Un-subscribing')
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    //For notifying observers of changes that occur within the subject (loose coupling as temperature. humidity and pressure are passed directly to observers)
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    //Equivalent method to if data was pulled from a device/internet (simplified for the sake of this example)
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Additional WeatherData methods below as required
}
