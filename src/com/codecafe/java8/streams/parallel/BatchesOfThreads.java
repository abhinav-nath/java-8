package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;

public class BatchesOfThreads {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                             21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);

        // parallel
        numbers.parallelStream()
               .map(e -> transform(e))
               .forEach(e -> {});       // doing nothing

    }
    
    private static int transform(int number) {
        System.out.println("t: " + number + "--" + Thread.currentThread());
        sleep(2000);
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