package com.designpatterns.behavioral;
public class Client {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command dimLight = new DimLightCommand(livingRoomLight);

        CommandQueue commandQueue = new CommandQueue();

        // Add commands to the queue
        commandQueue.addCommand(lightOn);
        commandQueue.addCommand(dimLight);
        commandQueue.addCommand(lightOff);

        // Execute all commands in the queue with parameter "50%"
        commandQueue.executeAll("50%");

        // Undo the last command (which is lightOff)
        commandQueue.undoLast(); // This will turn the light back on

        // Undo another command (which is dimLight)
        commandQueue.undoLast(); // This will brighten the light to full
    }
}
