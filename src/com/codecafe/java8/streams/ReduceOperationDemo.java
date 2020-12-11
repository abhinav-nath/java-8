package com.codecafe.java8.streams;

import java.util.Arrays;
import java.util.List;

/*
 * identity - a value that has no effect when used in an operation
 *   0 + n = n
 *    so identity value for sum operation will be 0
 * similarly
 *   1 x n = n
 *    so identity value for product operation will be 1
 * 
 * accumulator - BinaryOperator
 */

public class ReduceOperationDemo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = nums.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        int product = nums.stream()
                          .reduce(1, (a, b) -> a * b);

        System.out.println(product);
    }

}