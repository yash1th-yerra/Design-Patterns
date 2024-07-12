package com.designpatterns.behavioral;

public class ForecastDisplay implements DisplayElement, Observer {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humid, float pressure) {
		// TODO Auto-generated method stub
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

	}

}
