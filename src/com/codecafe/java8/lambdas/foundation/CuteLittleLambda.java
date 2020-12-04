package com.codecafe.java8.lambdas.foundation;

import com.codecafe.java8.functionalinterfaces.MyFunctionalInterface;

public class CuteLittleLambda {

    public static void main(String[] args) {

        MyFunctionalInterface fun = () -> System.out.println("hello");

        fun.myAbstractMethod();

    }

}