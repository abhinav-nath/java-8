package com.codecafe.java8.functionalprogramming.designpatterns.strategy.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Using lambda expressions to pass in the strategy to the same sum() method.
 * 
 * In other words, sum() method is the engine for the computation,
 * but what values need to be totaled are determined by the strategy that
 * is passed as a Predicate.
 */
public class StrategyPattern2 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("sum of all numbers = " + sum(nums, num -> true));            // requirement 1
        System.out.println("sum of even numbers = " + sum(nums, num -> num % 2 == 0));   // requirement 2
        System.out.println("sum of odd numbers = " + sum(nums, num -> num % 2 != 0));    // requirement 3
    }

    private static int sum(List<Integer> nums, Predicate<Integer> selector) {
        int total = 0;

        for (int num : nums) {
            if (selector.test(num))
                total += num;
        }
        return total;
    }

}