package com.designpatterns.structural;

public class Circle extends Shape{
	public Circle(Color color) {
		super(color);
	}
	@Override
	public void draw() {
		System.out.println("Drawing Circle-");
		color.applyColor();	
	}

}
