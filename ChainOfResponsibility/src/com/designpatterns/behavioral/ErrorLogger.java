package com.designpatterns.behavioral;

public class ErrorLogger extends Logger {
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		
		// TODO Auto-generated method stub
		System.out.println("Standard Error Logger: "+message);

	}

}
