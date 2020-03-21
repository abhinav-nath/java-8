package com.codecafe.java8.lambdas.foundation;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting greeting = new HelloWorldGreeting();
        greeter.greet(greeting); // passing a behavior to the greet() method
    }
}