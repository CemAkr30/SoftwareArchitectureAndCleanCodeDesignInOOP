package solid.d.problem;

public class WeatherAggregator {

    /***
     *  DIP'nin ihlal edilme nedeni şu şekildedir:
     *
     * WeatherAggregator sınıfı, doğrudan AccuweatherApi ve BbcWeatherApi sınıflarına bağlıdır.
     * Bu durumda, WeatherAggregator sınıfı, belirli hava durumu API'lerinin detaylarına sıkı sıkıya bağlıdır
     * ve bu API'lerde bir değişiklik olması durumunda WeatherAggregator sınıfında değişiklik yapmanız gerekebilir.
     *
     */
    private AccuweatherApi accuweather = new AccuweatherApi();
    private BbcWeatherApi bbcWeather = new BbcWeatherApi();

    public double getTemperature() {
        return (accuweather.getTemperatureCelcius()
                + toCelcius(
                bbcWeather.getTemperatureFahrenheit())) / 2;
    }

    private double toCelcius(double temperatureFahrenheit) {
        return (temperatureFahrenheit - 32) / 1.8f;
    }
}
