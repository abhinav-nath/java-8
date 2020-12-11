package com.codecafe.java8.functionalprogramming.designpatterns.command;

// Receiver
public class AC {

    // Commands which can be invoked by the client through the invoker

    public void turnOn() {
        System.out.println("turning on AC");
    }

    public void turnOff() {
        System.out.println("turning off AC");
    }

    public void incTemp() {
        System.out.println("Increasing temperature");
    }

    public void decTemp() {
        System.out.println("Decreasing temperature");
    }

}