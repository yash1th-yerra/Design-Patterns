package com.designpatterns.structural.o1;

public class PenAdapter implements Pen {
	PilotPen pp = new PilotPen();
	public void write(String str) {
		pp.mark(str);
		
	}

}
