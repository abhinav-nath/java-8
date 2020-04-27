package com.codecafe.java8.lambdas.foundation.ceremony;

public class NoCeremony {

    public static void main(String[] args) {

        Thread th = new Thread( () -> System.out.println("In another thread") );
        th.start();

        System.out.println("In main thread");
    }

}