package com.codecafe.java8.lambdas.foundation;

import com.codecafe.java8.functionalinterfaces.MyFunctionalInterface;

public class PassingTheBehavior {

    public static void main(String[] args) {

        // pass the behavior as a parameter
        onTheFly(() -> System.out.println("hello"));

    }

    private static void onTheFly(MyFunctionalInterface fun) {

        fun.myAbstractMethod();

    }

}