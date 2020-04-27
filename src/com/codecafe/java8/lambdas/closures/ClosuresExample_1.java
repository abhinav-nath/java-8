package com.codecafe.java8.lambdas.closures;

// Closure like functionality in Java 7
public class ClosuresExample_1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20; // b is assumed as a final by the Java compiler

        doProcess(a, new Process() {

            @Override
            public void process(int i) {
                //b = 30; Local variable b defined in an enclosing scope must be final or effectively final
                System.out.println(i + b);				
            }

        });

    }


    public static void doProcess(int i, Process p) {
        p.process(i);
    }


    interface Process {
        void process(int i);
    }

}