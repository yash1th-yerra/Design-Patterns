package com.designpatterns.behavior;

public class YellowState implements State {
	public void handle(TrafficLight context) {
		System.out.println("Yellow Light-Caution");
		context.setState(new RedState());
	}

}
