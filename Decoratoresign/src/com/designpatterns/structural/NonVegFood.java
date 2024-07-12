package com.designpatterns.structural;

public class NonVegFood extends FoodDecorator {
	public NonVegFood(Food newFood) {
		super(newFood);
	}
	public String prepareFood() {
		return super.prepareFood()+"with Roasted chicken and chicken curry";
	}
	public double showPrice() {
		return super.showPrice()+150.50;
	}
	

}
