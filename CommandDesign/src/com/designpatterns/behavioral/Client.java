package com.designpatterns.behavioral;

public class Client {

	public static void main(String[] args) {
		Light livingRoomLight = new Light(); 
		// TODO Auto-generated method stub
		Command lightOn = new LightOnCommand(livingRoomLight);
		Command lightOff = new LightOffCommand(livingRoomLight);
		RemoteControl rc1 = new RemoteControl();
		RemoteControl rc2 = new RemoteControl();
		rc1.setCommand(lightOn);
		rc1.pressButton(); 
		rc2.setCommand(lightOff);
		rc2.pressButton();
		

	}

}
