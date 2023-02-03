package com.example.mufiye.designPattern.observer;

import java.util.ArrayList;
import java.util.Observer;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<WeatherObserver> observers;


    public WeatherData() {
        observers = new ArrayList<WeatherObserver>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
//    public void setTemperature(float temperature) {
//        this.temperature = temperature;
//    }
//
//    public void setPressure(float pressure) {
//        this.pressure = pressure;
//    }
//
//    public void setHumidity(float humidity) {
//        this.humidity = humidity;
//    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        if(observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer : this.observers){
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
