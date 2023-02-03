package com.example.mufiye.designPattern.observer;

// 观察者接口，由观察者来实现
public interface WeatherObserver {
    public void update(float temperature, float pressure, float humidity);
}
