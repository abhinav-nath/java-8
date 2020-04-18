package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;

public class UseOfStreamsNumbersExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// double every number in the list
		numbers.stream()
		       .mapToInt(value -> value * 2)
		       .forEach(System.out::println);

		// double every number and find the total
		System.out.println( "total = " +
				numbers.stream()
				       .mapToInt(value -> value * 2)
				       .sum()
				);
		
		// double the first even number greater than 3
		System.out.println("result : " + 
				numbers.stream()
                       .filter(value -> value > 3)
                       .filter(value -> value % 2 == 0)
                       .map(value -> value * 2)
                       .findFirst()
				);
	}

}