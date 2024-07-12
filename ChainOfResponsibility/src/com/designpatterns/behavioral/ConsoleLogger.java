package com.designpatterns.behavioral;

public class ConsoleLogger extends Logger {
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		
		// TODO Auto-generated method stub
		System.out.println("Standard Console Logger: "+message);

	}

}
