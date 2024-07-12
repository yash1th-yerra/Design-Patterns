package com.designpatterns.behavior;

public class GreenState implements State {
	public void handle(TrafficLight context) {
		System.out.println("Green Light-Go");
		context.setState(new YellowState());
	}

}
