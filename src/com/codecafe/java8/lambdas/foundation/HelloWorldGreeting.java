package com.codecafe.java8.lambdas.foundation;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}