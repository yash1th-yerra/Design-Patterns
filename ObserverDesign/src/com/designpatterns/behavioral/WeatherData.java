package com.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	public WeatherData(){
		observers = new ArrayList<>();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}
	public void notifyObservers() {
		for(Observer ob:observers) {
			ob.update(temperature,humidity,pressure);
		}
	}
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		measurementsChanged();
	}

}
