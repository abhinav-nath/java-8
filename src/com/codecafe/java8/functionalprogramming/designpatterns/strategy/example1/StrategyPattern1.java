package com.codecafe.java8.functionalprogramming.designpatterns.strategy.example1;

import java.util.Arrays;
import java.util.List;

/* Worst way of implementing different strategies to perform calculations
 * that revolve around similar lines of code.
 * 
 * In this example, requirements came one after other.
 * 
 * A careless programmer would do something like this -> copy & paste !
 */
public class StrategyPattern1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("sum of all numbers = " + sum(nums));          // requirement 1
        System.out.println("sum of even numbers = " + sumOfEven(nums));   // requirement 2
        System.out.println("sum of odd numbers = " + sumOfOdd(nums));     // requirement 3
    }

    private static int sum(List<Integer> nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }
        return total;
    }

    private static int sumOfEven(List<Integer> nums) {
        int total = 0;

        for (int num : nums) {
            if (num % 2 == 0)
                total += num;
        }
        return total;
    }

    private static int sumOfOdd(List<Integer> nums) {
        int total = 0;

        for (int num : nums) {
            if (num % 2 != 0)
                total += num;
        }
        return total;
    }

}