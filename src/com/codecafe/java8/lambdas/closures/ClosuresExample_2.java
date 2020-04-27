package com.codecafe.java8.lambdas.closures;

// Closure Lambda Expressions
public class ClosuresExample_2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20; // The compiler freezes the value of b as soon as it sees that b is used by a lambda expression

        doProcess(a, i -> System.out.println(i + b));
    }


    public static void doProcess(int i, Process p) {
        p.process(i);
    }


    interface Process {
        void process(int i);
    }

}