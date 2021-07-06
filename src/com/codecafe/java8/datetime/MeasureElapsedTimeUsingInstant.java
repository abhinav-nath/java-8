package com.codecafe.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class MeasureElapsedTimeUsingInstant {

    public static void main(String[] args) {

        Instant start = Instant.now();

        // Measure execution time for this method
        methodToTime();

        Instant finish = Instant.now();

        long timeElapsedInNanos = Duration.between(start, finish).toNanos(); // in nanos
        long timeElapsedInMillis = Duration.between(start, finish).toMillis(); // in millis

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