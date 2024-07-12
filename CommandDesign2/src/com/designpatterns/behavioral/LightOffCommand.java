package com.designpatterns.behavioral;
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(String param) {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
