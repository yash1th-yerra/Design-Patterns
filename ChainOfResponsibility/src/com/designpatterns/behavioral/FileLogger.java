package com.designpatterns.behavioral;

public class FileLogger extends Logger {
	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		
		// TODO Auto-generated method stub
		System.out.println("Standard Error Logger: "+message);

	}

}
