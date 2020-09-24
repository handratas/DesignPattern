package com.handrata.headfirstdesignpattern.pattern.observer.weatherstation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
