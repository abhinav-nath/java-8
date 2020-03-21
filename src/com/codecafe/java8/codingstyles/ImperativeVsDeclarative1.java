package com.codecafe.java8.codingstyles;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative1 {

	public static void main(String[] args) {

		// Find sum of Integers from 0 to 100

		/* Imperative Approach -- how to achieve the result ? */

		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i;
		}

		System.out.println("Sum with Imperative approach : " + sum);

		/* Declarative Approach -- What result to achieve ? */
		/* Need not to care about how it is done behind the scenes */
		int sum1 = IntStream.rangeClosed(0, 100).sum();

		System.out.println("Sum with Declarative approach : " + sum1);
	}

}
