package com.designpatterns.behavioral;
public interface Command {
    void execute(String param);
    void undo();
}
