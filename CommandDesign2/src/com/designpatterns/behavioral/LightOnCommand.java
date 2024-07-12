package com.designpatterns.behavioral;
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(String param) {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
