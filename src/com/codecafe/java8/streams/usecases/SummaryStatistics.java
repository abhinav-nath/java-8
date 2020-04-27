package com.codecafe.java8.streams.usecases;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class SummaryStatistics {

    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();

        for(int i=0; i<10; i++)
            randomNumbers.add(i, new Random().nextInt(100));

        System.out.println("list of random numbers :\n" + randomNumbers);

        IntSummaryStatistics stats = randomNumbers.stream()
                                                  .mapToInt((x) -> x)
                                                  .summaryStatistics();

        System.out.println("\nmaximum number in the list : " + stats.getMax());
        System.out.println("minimum number in the list : " + stats.getMin());
        System.out.println("sum of all numbers in the list : " + stats.getSum());
        System.out.println("average of numbers in the list : " + stats.getAverage());
    }

}