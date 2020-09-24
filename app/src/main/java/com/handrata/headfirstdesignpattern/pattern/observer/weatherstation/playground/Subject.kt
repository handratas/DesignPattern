package com.handrata.headfirstdesignpattern.pattern.observer.weatherstation.playground

interface Subject<T> {
    val observerList: MutableList<Observer2<T>>
    fun registerObserver(observer: Observer2<T>) { observerList.add(observer) }
    fun removeObserver(observer: Observer2<T>) { observerList.filter { it == observer } }
    fun notifyObserver()
}

typealias Observer2<T> = (data: T) -> Unit

interface Observer<T> {
    fun update(data: T)
}

interface DisplayElement {
    fun display()
}

data class WeatherData(
    private var temperature: Long = 0,
    private var humidity: Long = 0,
    private var pressure: Long = 0
) : Subject<WeatherData> {
    override val observerList: MutableList<Observer2<WeatherData>> = mutableListOf()

    val temperatureData get() = temperature
    val humidityData get() = humidity
    val pressureData get() = pressure

    override fun notifyObserver() {
        observerList.forEach { it.invoke(this) }
    }

    fun setData(temperature: Long = 0,
                humidity: Long = 0,
                pressure: Long = 0) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
    }
}

class CurrentConditionDisplay(
    data: Subject<WeatherData>
): Observer2<WeatherData>,
    DisplayElement {
    private var temperature: Long = 0
    private var humidity: Long = 0
    private var pressure: Long = 0

    init {
        data.registerObserver(this)
    }

//    override fun update(data: WeatherData) {
//        temperature = data.temperature
//        humidity = data.humidity
//        pressure = data.pressure
//        display()
//    }

    override fun display() {
        println("CurrentConditionDisplay: temperature: $temperature, humidity: $humidity, pressure: $pressure")
    }

    override fun invoke(data: WeatherData) {
        temperature = data.temperatureData
        humidity = data.humidityData
        pressure = data.pressureData
        display()
    }
}

class WeatherStation {
    fun run() {
        val data = WeatherData()
        val currentDisplay = CurrentConditionDisplay(data)

        data.setData(temperature = 20, humidity = 30, pressure = 50)
        data.notifyObserver()
        data.setData(temperature = 60)
        data.notifyObserver()
    }
}