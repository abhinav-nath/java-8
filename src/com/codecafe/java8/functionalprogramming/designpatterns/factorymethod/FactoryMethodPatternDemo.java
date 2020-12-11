package com.codecafe.java8.functionalprogramming.designpatterns.factorymethod;

// Creational pattern

// Creating object without exposing the instantiation logic.

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        Flooring floor = FlooringFactory.getFlooring(-1, 18);

        floor.installation();
    }

}