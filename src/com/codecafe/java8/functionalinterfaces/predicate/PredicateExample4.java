package com.codecafe.java8.functionalinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample4 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 4, 5, 5, 5, 6);

        System.out.println("Sum of all numbers = " + sumWithCondition(list, n -> true));
        System.out.println("Sum of all even numbers = " + sumWithCondition(list, i -> i % 2 ==0));
        System.out.println("Sum of numbers > 5 = " + sumWithCondition(list, i -> i > 5));
    }

    private static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                      .filter(predicate)
                      .mapToInt(i -> i)
                      .sum();
    }

}