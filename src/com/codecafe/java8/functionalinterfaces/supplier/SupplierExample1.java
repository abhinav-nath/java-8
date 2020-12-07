package com.codecafe.java8.functionalinterfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample1 {

    public static void main(String[] args) {

        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println(randomNumber.get());
    }

}