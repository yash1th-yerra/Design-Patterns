package com.designpatterns.creation;

public abstract class Plan {
	protected double rate;
	abstract double getRate();
	public double calculateBill(int units) {
		return units*rate;
		
	}
	

}
