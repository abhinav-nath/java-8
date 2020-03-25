package com.codecafe.java8.lambdas.exceptionhandling;

import java.util.function.BiConsumer;

//Exception Handling - Option 2
public class ExceptionHandlingExample_2 {

	public static void main(String[] args) {

		int[] someNumbers = { 1, 2, 3, 4 };
		
		//int key = 2;
		int key = 0;
		
		System.out.println("Addition operation :");
		process(someNumbers, key, (v, k) -> System.out.print(v + k + " "));
		
		System.out.println("\nDivision operation :");
		process(someNumbers, key, (v, k) -> {
			try {
				System.out.print(v / k + " ");
			} catch (ArithmeticException e) {
				System.out.println("An Arithmetic Exception Happened");
			}
		});
		
		System.out.println("\nMultiplication operation :");
		process(someNumbers, key, (v, k) -> System.out.print(v * k + " "));

	}


	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers)
			consumer.accept(i, key);
	}

}