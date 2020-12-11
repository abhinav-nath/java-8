package com.codecafe.java8.functionalprogramming.designpatterns.command;

/*
 * Command Pattern -
 * A way to encapsulate a request as an object, parameterize clients with
 * different requests and perform corresponding operations.
 * 
 * Consists of four key players:
 * 
 * 1. Command
 * 2. Receiver
 * 3. Invoker
 * 4. Client
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        AC ac1 = new AC();
        AC ac2 = new AC();

        ACRemote remote = new ACRemote();
        remote.setCommand(ac2::turnOn);
        remote.buttonPressed();

        remote.setCommand(ac1::turnOn);
        remote.buttonPressed();

        remote.setCommand(ac2::incTemp);
        remote.buttonPressed();

        remote.setCommand(ac1::decTemp);
        remote.buttonPressed();
    }

}