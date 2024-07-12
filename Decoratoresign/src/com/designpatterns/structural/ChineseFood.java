package com.designpatterns.structural;

public class ChineseFood extends FoodDecorator {
	public ChineseFood (Food newFood) {
		super(newFood);
	}
	public String prepareFood() {
		return super.prepareFood()+"with Fried Rice and Munchurian";
	}
	public double showPrice() {
		return super.showPrice()+ 65.50;
	}

}
