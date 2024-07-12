package com.designpatterns.behavioral;
public class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }

    public void dim(String level) {
        System.out.println("The light is dimmed to " + level);
    }

    public void brighten() {
        System.out.println("The light is brightened to full");
    }
}
