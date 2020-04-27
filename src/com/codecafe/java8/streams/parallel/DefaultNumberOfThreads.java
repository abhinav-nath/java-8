package com.codecafe.java8.streams.parallel;

import java.util.concurrent.ForkJoinPool;

public class DefaultNumberOfThreads {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(ForkJoinPool.commonPool());
    }

}