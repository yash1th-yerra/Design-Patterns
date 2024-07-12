package com.designpatterns.structural;

public class BridgeDesignDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(new Red());
		Shape blueCircle = new Circle(new Blue());
		Shape redRectangle = new Rectangle(new Red());
		Shape blueRectangle = new Rectangle(new Blue());
		redCircle.draw();
		blueRectangle.draw();
	}

}
