package com.codecafe.java8.functionalprogramming.designpatterns.command;

// Invoker
public class ACRemote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}