package com.codecafe.java8.functionalprogramming.designpatterns.strategy.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// We can refactor the sum() method to a more functional style

public class StrategyPattern3 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("sum of all numbers = " + sum(nums, num -> true));            // requirement 1
        System.out.println("sum of even numbers = " + sum(nums, num -> num % 2 == 0));   // requirement 2
        System.out.println("sum of odd numbers = " + sum(nums, num -> num % 2 != 0));    // requirement 3
    }

    private static int sum(List<Integer> nums, Predicate<Integer> selector) {
        return nums.stream()
                   .filter(selector)
                   .mapToInt(e -> e)
                   .sum();
    }

}