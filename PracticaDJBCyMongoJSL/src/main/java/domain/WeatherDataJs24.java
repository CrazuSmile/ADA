/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author jojosl
 */
public class WeatherDataJs24 {

    private int recordId;
    private String city;
    private String country;
    private double latitude;
    private double longitude;
    private String date;
    private int temperatureCelsius;
    private int humidityPercent;
    private double precipitationMm;
    private int windSpeedKmh;
    private String weatherCondition;
    private String forecast;
    private String updated;

    public WeatherDataJs24() {
    }

    public WeatherDataJs24(int recordId) {
        this.recordId = recordId;
    }

    public WeatherDataJs24(int recordId, String city, String date, int temperatureCelsius) {
        this.recordId = recordId;
        this.city = city;
        this.date = date;
        this.temperatureCelsius = temperatureCelsius;
    }

    public WeatherDataJs24(String city, int temperatureCelsius) {
        this.city = city;
        this.temperatureCelsius = temperatureCelsius;
    }

    public WeatherDataJs24(int recordId, String city, String country, double latitude, double longitude,
            String date, int temperatureCelsius, int humidityPercent, double precipitationMm,
            int windSpeedKmh, String weatherCondition, String forecast, String updated) {
        this.recordId = recordId;
        this.city = city;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.temperatureCelsius = temperatureCelsius;
        this.humidityPercent = humidityPercent;
        this.precipitationMm = precipitationMm;
        this.windSpeedKmh = windSpeedKmh;
        this.weatherCondition = weatherCondition;
        this.forecast = forecast;
        this.updated = updated;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public int getHumidityPercent() {
        return humidityPercent;
    }

    public void setHumidityPercent(int humidityPercent) {
        this.humidityPercent = humidityPercent;
    }

    public double getPrecipitationMm() {
        return precipitationMm;
    }

    public void setPrecipitationMm(double precipitationMm) {
        this.precipitationMm = precipitationMm;
    }

    public int getWindSpeedKmh() {
        return windSpeedKmh;
    }

    public void setWindSpeedKmh(int windSpeedKmh) {
        this.windSpeedKmh = windSpeedKmh;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "WeatherData{"
                + "recordId=" + recordId
                + ", city='" + city + '\''
                + ", country='" + country + '\''
                + ", latitude=" + latitude
                + ", longitude=" + longitude
                + ", date='" + date + '\''
                + ", temperatureCelsius=" + temperatureCelsius
                + ", humidityPercent=" + humidityPercent
                + ", precipitationMm=" + precipitationMm
                + ", windSpeedKmh=" + windSpeedKmh
                + ", weatherCondition='" + weatherCondition + '\''
                + ", forecast='" + forecast + '\''
                + ", updated='" + updated + '\''
                + '}';
    }
}
