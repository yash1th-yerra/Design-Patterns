package com.designpatterns.behavior;

public class RedState implements State {
	public void handle(TrafficLight context) {
		System.out.println("Red Light-Stop");
		context.setState(new GreenState());
		
	}

}
