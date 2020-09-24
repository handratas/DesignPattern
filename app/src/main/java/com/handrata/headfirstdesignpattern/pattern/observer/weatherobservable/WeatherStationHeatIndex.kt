package com.handrata.headfirstdesignpattern.pattern.observer.weatherobservable

fun main() {
    val weatherData = WeatherData()
    val currentConditions = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(80f, 65f, 30.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.2f)
}

/** this is bad example since Observable is concrete class, and need to be inherited (we cannot write our own implementation
 * - We are coding to concrete implementation, not interface
 * - For every new display element we need to alter code
 * - We have no way to add display elements on run time.
 * - We haven't encapsulate what changes. (on this case, state we observed is something that varies and need to be encapsulated
 *
 */