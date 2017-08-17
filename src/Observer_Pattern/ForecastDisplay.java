package Observer_Pattern;

/**
 * Created by Julian on 17/08/2017.
 */
public class ForecastDisplay implements Observer, Display {
    //Store a mid-range/average value for current pressure
    private float currentPressure = 29.92f;
    private float lastPressure;
    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
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
