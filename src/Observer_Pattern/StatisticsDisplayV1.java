package Observer_Pattern;

import java.util.Observer;
import java.util.Observable;

/**
 * Created by Julian on 18/08/2017.
 */
public class StatisticsDisplayV1 implements Observer, Display {
    //Set default maxTemp, minTemp to be suitably low/high respectively to be automatically overwritten.
    // Also initialise tempSum to 0.0
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    Observable observable;

    public StatisticsDisplayV1(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataV1) {
            WeatherDataV1 weatherData = (WeatherDataV1) obs;
            float temperature_pull = weatherData.getTemperature();
            tempSum += temperature_pull;
            numReadings++;

            if (temperature_pull > maxTemp) {
                maxTemp = temperature_pull;
            }

            if (temperature_pull < minTemp) {
                minTemp = temperature_pull;
            }
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
