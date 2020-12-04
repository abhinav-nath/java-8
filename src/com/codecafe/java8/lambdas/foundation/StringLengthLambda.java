package com.codecafe.java8.lambdas.foundation;

public class StringLengthLambda {

    public static void main(String[] args) {

        LengthOfString len = str -> str.length();
        int length = len.length("hello");
        System.out.println(length);

    }

}