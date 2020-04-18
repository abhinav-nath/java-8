package com.codecafe.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsAreLazy {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// double the first even number greater than 3
		System.out.println("result : " + 
				numbers.stream()
                       .filter(StreamsAreLazy::isGreaterThan3)
                       .filter(StreamsAreLazy::isEven)
                       .map(StreamsAreLazy::doubleIt)
                       .findFirst()
				);
	}

	public static boolean isGreaterThan3(int number) {
		System.out.println("isGreaterThan3 invoked for number : " + number);
		return number > 3;
	}
	
	public static boolean isEven(int number) {
		System.out.println("isEven invoked for number : " + number);
		return number % 2 == 0;
	}
	
	public static int doubleIt(int number) {
		System.out.println("doubleIt invoked for number : " + number);
		return number * 2;
	}
	
}