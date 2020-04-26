package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;

public class OrderingInParallelStreams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // the terminal operations may or may not be ordered by nature
        // unordered terminal operations may have an ordered counterpart
        // forEach - unordered    forEachOrdered - ordered
        // forEachOrdered DOES NOT convert the execution pipeline into sequential.
        // it is a concurrent execution except it says "I will not run until the one before me has completed"
        // therefore it imposes ordering but not sequential execution
        // however, forEachOrdered will guarantee ordering only on naturally ordered Collections like Lists
        // it cannot make a Set ordered because Set is an unordered collection by nature
        numbers.parallelStream()
               .map(e -> transform(e))
               .forEachOrdered(e -> printIt(e));

    }
    
    private static int transform(int number) {
        System.out.println("t: " + number + "--" + Thread.currentThread());
        sleep(1000);
        return number * 1;
    }

    private static void printIt(int number) {
        System.out.println("p: " + number + "--" + Thread.currentThread());
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