package com.example.mufiye.designPattern.observer;

public interface Subject {
    public void registerObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public void notifyObservers();
}
