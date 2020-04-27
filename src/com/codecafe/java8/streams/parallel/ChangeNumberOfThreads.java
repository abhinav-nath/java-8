package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ChangeNumberOfThreads {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                             21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);

        process(numbers.parallelStream()
                       .map(e -> transform(e)));

    }
    
    public static void process(Stream<Integer> stream) throws InterruptedException {

        ForkJoinPool pool = new ForkJoinPool(100);

        // it doesn't matter where the stream was born, it matters where the terminal operation is executed
        // so here the terminal operation is executing inside the process() method which has a pool of 100 threads.
        pool.submit(() -> stream.forEach(e -> {}));

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);
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