package com.handrata.headfirstdesignpattern.pattern.observer.weatherstation

import kotlin.random.Random

fun main() {
    var weatherData: WeatherData? = WeatherData()
    var currentDisplay: CurrentConditionDisplay? = CurrentConditionDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)

    weatherData?.setMeasurements(80F, 65F, 30.4F)
    weatherData?.setMeasurements(82F, 70F, 29.2F)
    weatherData?.setMeasurements(78F, 90F, 29.2F)
}