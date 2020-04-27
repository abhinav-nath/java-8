package com.codecafe.java8.lambdas.typeinference;

public class TypeInferenceDemo {

    public static void main(String[] args) {

        StringLengthLambda myLambda = s -> s.length();

        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(myLambda);

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello"));
    }

    // functional interface
    interface StringLengthLambda {
        int getLength(String s);
    }
}