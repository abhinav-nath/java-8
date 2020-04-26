package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SequentialAndParallelStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // sequential
        /*
        numbers.stream()
               .map(e -> transform(e))
               .forEach(System.out::println);
        */
        
        // parallel
        numbers.parallelStream()
               .map(e -> transform(e))
               .forEach(System.out::println);
        
        // use of stream.parallel()
        //use(numbers.stream());
    }
    
    private static void use(Stream<Integer> stream) {
        
        // sequential
        /*
        stream
            .map(e -> transform(e))
            .forEach(System.out::println);
        */
        
        // since we are not the creator of the stream, we need to use stream.parallel()
        /*
        stream
            .parallel()
            .map(e -> transform(e))
            .forEach(System.out::println);
        */
    }

    private static int transform(int number) {
        System.out.println("called for : " + number);
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