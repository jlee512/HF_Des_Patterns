package Observer_Pattern;

import java.util.Observable;

/**
 * Created by Julian on 17/08/2017.
 */
public class WeatherDataV1 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //Constructor no longer needed as Observable built-in Java class provides what we need
    public WeatherDataV1(){
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    //Equivalent method to if data was pulled from a device/internet (simplified for the sake of this example)
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Methods used for Observer Pattern - with 'Pull' update
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    //Additional WeatherData methods below as required
}

