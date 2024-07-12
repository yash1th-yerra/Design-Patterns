package com.designpatterns.behavior;

public class StatePatternDemo {
	public static void main(String[] args) {
		 TrafficLight light = new TrafficLight();
		 for(int i=0;i<6;i++) {
			 light.change();
		 }
	}
}
