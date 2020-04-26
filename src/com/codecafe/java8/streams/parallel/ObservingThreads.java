package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;

public class ObservingThreads {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // parallel
        numbers.parallelStream()
               .map(e -> transform(e))
               .forEach(e -> {});       // doing nothing

    }
    
    private static int transform(int number) {
        System.out.println("t: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return number * 1;
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }

}