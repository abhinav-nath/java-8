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
        System.out.println("sum of double of every number = " +
                numbers.stream()
                       .mapToInt(value -> value * 2)
                       .sum()
				);
        
        // find the sum of double of every even number
        System.out.println("sum of double of all even numbers = " +
        		numbers.stream()
                       .filter(value -> value % 2 == 0)
                       .mapToInt(value -> value * 2)
                       .sum()
        		);
		
		// double the first even number greater than 3
        System.out.println("double of the first even number greater than 3 = " + 
                numbers.stream()
                       .filter(value -> value > 3)
                       .filter(value -> value % 2 == 0)
                       .map(value -> value * 2)
                       .findFirst()
				);
	}

}