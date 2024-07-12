package com.designpatterns.structural.o1;

public class School {
	public static void main(String[] args) {
		Pen p = new PenAdapter();
		Assignment a   = new Assignment();
		a.setP(p);
		a.writeAssignment("Writing");
		
	}

}
