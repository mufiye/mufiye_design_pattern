package com.example.mufiye.designPattern.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);
        weatherData.setData(10, 100, 30);
        // currentConditions.display();
    }
}
