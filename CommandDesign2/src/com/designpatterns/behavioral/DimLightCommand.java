package com.designpatterns.behavioral;
public class DimLightCommand implements Command {
    private Light light;
    private String previousLevel;

    public DimLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(String level) {
        previousLevel = "full"; // Assuming previous state was full brightness
        light.dim(level);
    }

    @Override
    public void undo() {
        light.brighten();
    }
}
