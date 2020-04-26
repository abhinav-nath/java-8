package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctValues {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 6, 7, 8, 9, 9, 10);

		// find out squares of distinct numbers
        System.out.println(numbers.stream()
                                  .map(n -> n * n)
                                  .distinct()
                                  .collect(Collectors.toList()));
	}

}