package Observer_Pattern;

/**
 * Created by Julian on 17/08/2017.
 */
public class WeatherStation {
    //This implemenation is symbolic of weather station hardware sending new data for the purposes of testing our observer pattern

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println();
        System.out.println("Weather Displays version 1: ");

        WeatherDataV1 weatherDataV1 = new WeatherDataV1();
        CurrentConditionsDisplayV1 currentDisplayV1 = new CurrentConditionsDisplayV1(weatherDataV1);
        StatisticsDisplayV1 statisticsDisplayV1 = new StatisticsDisplayV1(weatherDataV1);
        ForecastDisplayV1 forecastDisplayV1 = new ForecastDisplayV1(weatherDataV1);
        HeatIndexDisplayV1 heatIndexDisplayV1 = new HeatIndexDisplayV1(weatherDataV1);

        weatherDataV1.setMeasurements(80, 65, 30.4f);
        weatherDataV1.setMeasurements(82, 70, 29.2f);
        weatherDataV1.setMeasurements(78, 90, 29.2f);

    }

}
