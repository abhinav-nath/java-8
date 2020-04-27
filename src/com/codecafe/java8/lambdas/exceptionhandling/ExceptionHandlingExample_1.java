package com.codecafe.java8.lambdas.exceptionhandling;

import java.util.function.BiConsumer;

/*
  Suppose we have an array of numbers and a key.
  We want to write a method which takes in the array, key and an operation to perform.

  This method should loop through the list of the array elements and perform any mathematical operation on each element
  depending upon what operation is passed to it.

  Something like this :

	    int[] someNumbers = { 1, 2, 3, 4 };
		int key = 2;
		process(someNumbers, key, ________ );
 */

/* How do we do Exception Handling if we need to handle any exception ? This can be done in 3 ways.

  1. Do exception handling in the process() method -> not good, the exception handling may not be applicable to other implementations of the behavior.
  2. Do exception handling in the lambda expression -> not elegant, makes the lambda messy and inelegant.
  3. Write a wrapper lambda and move exception handling from the main lambda to the wrapper lambda.

 */

// Exception Handling - Option 1
public class ExceptionHandlingExample_1 {

    public static void main(String[] args) {

        int[] someNumbers = { 1, 2, 3, 4 };

        //int key = 2;
        int key = 0;

        System.out.println("Addition operation :");
        process(someNumbers, key, (v, k) -> System.out.print(v + k + " "));

        System.out.println("\nDivision operation :");
        process(someNumbers, key, (v, k) -> System.out.print(v / k + " "));

        System.out.println("\nMultiplication operation :");
        process(someNumbers, key, (v, k) -> System.out.print(v * k + " "));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {

        for(int i : someNumbers) {
            try {
                consumer.accept(i, key);
            } catch (ArithmeticException e) {
                System.out.println("An Arithmetic Exception Happened");
            }
        }
    }

}