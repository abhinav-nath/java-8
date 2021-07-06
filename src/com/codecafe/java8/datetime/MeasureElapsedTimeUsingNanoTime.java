package com.codecafe.java8.datetime;

import java.util.concurrent.TimeUnit;

// Recommended method

public class MeasureElapsedTimeUsingNanoTime {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        // Measure execution time for this method
        methodToTime();

        long endTime = System.nanoTime();

        long timeElapsedInNanos = (endTime - startTime);  // in nanos
        long timeElapsedInMillis = TimeUnit.NANOSECONDS.toMillis(timeElapsedInNanos); // in millis

        System.out.println("elapsed time : " + timeElapsedInNanos + " nanos" + ", " + timeElapsedInMillis + " millis");
    }

    private static void methodToTime() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}