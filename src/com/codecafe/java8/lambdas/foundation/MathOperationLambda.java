package com.codecafe.java8.lambdas.foundation;

public class MathOperationLambda {

    public static void main(String[] args) {

        MathOperation add = (a, b) -> System.out.println(a + b);
        add.perform(10, 20);

        MathOperation multiply = (a, b) -> System.out.println(a * b);
        multiply.perform(25, 4);

    }

}