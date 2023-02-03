package com.example.mufiye.designPattern.observer;

public class CurrentConditions implements WeatherObserver{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("temperature: " + temperature);
        System.out.println("pressure: " + pressure);
        System.out.println("humidity: " + humidity);
    }
}
