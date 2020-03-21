package com.codecafe.java8.codingstyles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative2 {

	public static void main(String[] args) {

		// Remove duplicates from a list of Integers

		/* Imperative Approach -- how to achieve the result ? */

		List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 3, 4, 1, 6, 7, 6, 8, 9, 2, 8, 10, 10, 2, 3, 4, 1, 1, 1);
		
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}

		System.out.println("Unique List with Imperative approach : " + uniqueList);

		/* Declarative Approach -- What result to achieve ? */

		List<Integer> uniqueList1 = integerList.stream()
				.distinct()
				.collect(Collectors.toList());

		System.out.println("Unique List with Imperative approach : " + uniqueList1);
	}

}
