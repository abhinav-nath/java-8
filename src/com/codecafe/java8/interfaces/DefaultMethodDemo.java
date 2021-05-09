package com.codecafe.java8.interfaces;

interface TestInterface {

    // abstract method
    public void square(int a);

    // default method
    default void show() {
        System.out.println("Default Method show() Executed");
    }

    // default method
    default void print() {
        System.out.println("Default Method print() Executed");
    }

}

public class DefaultMethodDemo implements TestInterface {

    // implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        DefaultMethodDemo d = new DefaultMethodDemo();
        d.square(4);

        // executing default methods
        d.show();
        d.print();
    }

}