package com.designpatterns.behavioral;

public class ChainPatternDemo {
	private static Logger getChainOfLogger() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);
		
		errorLogger.setNextLogger(consoleLogger);
	    consoleLogger.setNextLogger(fileLogger);
	    return errorLogger;
	}
	public static void main(String[] args) {
		Logger loggerChain = getChainOfLogger();
		loggerChain.logMessage(Logger.INFO,"This is an Information");
		loggerChain.logMessage(Logger.DEBUG,"This is an debug level Information");
		loggerChain.logMessage(Logger.ERROR,"This is an error level Information");
	}

}
