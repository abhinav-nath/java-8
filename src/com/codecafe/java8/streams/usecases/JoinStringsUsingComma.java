package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsUsingComma {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("India", "USA", "Mexico", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		
		// convert strings to upper case and join them using comma
		System.out.println(strings.stream()
				                  .map(s -> s.toUpperCase())
				                  .collect(Collectors.joining(", ")));

	}

}