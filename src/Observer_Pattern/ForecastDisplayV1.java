package Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Julian on 17/08/2017.
 */
public class ForecastDisplayV1 implements Observer, Display {
    //Store a mid-range/average value for current pressure
    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplayV1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataV1) {
            WeatherDataV1 weatherData = (WeatherDataV1) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way");
        } else if (currentPressure == lastPressure) {
            System.out.println("Expect more of the same");
        } else {
            System.out.println("Weather is expected to deteriorate (cooler/rainier)");
        }
    }
}
