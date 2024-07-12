package com.designpatterns.behavioral;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature, humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Condition: "+temperature+"F and "+humidity+"% humidity");

	}

	@Override
	public void update(float temperature, float humid, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		display();
		// TODO Auto-generated method stub

	}

}
