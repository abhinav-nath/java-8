package com.codecafe.java8.interfaces;

interface InterfaceA {

    default void defaultMethod() {
        System.out.println("Interface A default method");
    }

}

interface InterfaceB {

    default void defaultMethod() {
        System.out.println("Interface B default method");
    }

}

public class DefaultMethodAmbiguity implements InterfaceA, InterfaceB {

    @Override
    public void defaultMethod() {
        InterfaceA.super.defaultMethod();
        InterfaceB.super.defaultMethod();
    }

    public static void main(String args[]) {
        DefaultMethodAmbiguity d = new DefaultMethodAmbiguity();

        // executing default methods
        d.defaultMethod();
    }

}