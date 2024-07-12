package com.designpatterns.behavioral;

public class StatisticsDisplay implements DisplayElement, Observer {
	private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humid, float pressure) {
		 tempSum += temperature;
	        numReadings++;

	        if (temperature > maxTemp) {
	            maxTemp = temperature;
	        }

	        if (temperature < minTemp) {
	            minTemp = temperature;
	        }

	        display();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	    

	}

}
