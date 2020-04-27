package com.codecafe.java8.hiddentreasures;

interface Util {

    // An Interface in Java 8 can contain static methods
    public static int numberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }
}

public class InterfaceWithStaticMethodImplementation {

    public static void main(String[] args) {

        // call the static method of interfaces from a static method
        System.out.println(Util.numberOfCores());
    }

}