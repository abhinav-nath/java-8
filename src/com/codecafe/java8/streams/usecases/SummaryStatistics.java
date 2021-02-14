package com.codecafe.java8.streams.usecases;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SummaryStatistics {

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();

        for(int i=0; i<10; i++)
            randomNumbers.add(i, new Random().nextInt(100));

        System.out.println("list of random numbers :\n" + randomNumbers);

        IntSummaryStatistics stats = randomNumbers.stream()
                                                  .mapToInt(x -> x)
                                                  .summaryStatistics();

        System.out.println("\nmaximum number in the list : " + stats.getMax());
        System.out.println("minimum number in the list : " + stats.getMin());
        System.out.println("sum of all numbers in the list : " + stats.getSum());
        System.out.println("average of numbers in the list : " + stats.getAverage());

        // OR

        int[] numbers = { 10, 2, 9, 4, 1, 8, 7, 5, 6, 3 };

        IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();

        System.out.println("\nmaximum number in the array : " + statistics.getMax());
        System.out.println("minimum number in the array : " + statistics.getMin());
        System.out.println("sum of all numbers in the array : " + statistics.getSum());
        System.out.println("average of numbers in the array : " + statistics.getAverage());
        System.out.println("count of numbers in the array : " + statistics.getCount());

    }

}