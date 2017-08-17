package Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Julian on 17/08/2017.
 */
public class CurrentConditionsDisplayV1 implements Observer, Display {
    private float temperature;
    private float humidity;
    //Store reference to the Subject
    Observable observable;

    public CurrentConditionsDisplayV1(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataV1) {
            WeatherDataV1 weatherData = (WeatherDataV1) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}

