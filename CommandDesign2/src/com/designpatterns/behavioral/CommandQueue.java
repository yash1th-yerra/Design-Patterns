package com.designpatterns.behavioral;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CommandQueue {
    private Queue<Command> commandQueue = new LinkedList<>();
    private Stack<Command> commandHistory = new Stack<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeAll(String param) {
        while (!commandQueue.isEmpty()) {
            Command command = commandQueue.poll();
            command.execute(param);
            commandHistory.push(command);
        }
    }

    public void undoLast() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
