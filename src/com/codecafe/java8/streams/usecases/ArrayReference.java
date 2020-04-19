package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayReference {

	public static void main(String[] args) {
		
		// convert a stream to an array
		Stream<String> cities = Stream.of("Mumbai", "London", "Paris");
		
		String[] arrayOfCities = cities.toArray(String[]::new); // array reference
	
	    // Equivalent to :
        // String[] arrayOfCities = cities.toArray(size -> new String[size]);
		
		System.out.println("array : " + Arrays.toString(arrayOfCities));

		// convert an array to a stream
		System.out.println("\nstream :");
		Stream<String> streamOfCities = Stream.of(arrayOfCities);
		streamOfCities.forEach(System.out::println);
		
	}

}