package com.codecafe.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String args[]) {

		// prior to Java 8
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0.compareTo(arg1);
			}
		};

		System.out.println("Result with legacy Comparator : " + comparator.compare(3,2));


		// Java 8 Lambda Syntax
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> {return a.compareTo(b);};

		System.out.println("Result with Lambda 1 : " + comparatorLambda.compare(3, 2));


		// Java 8 Lambda Syntax -- no need tp write in curly braces
		Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);

		System.out.println("Result with Lambda 2 : " + comparatorLambda1.compare(3, 2));


		// Java 8 Lambda Syntax -- no neeed to define the type of a and b
		Comparator<Integer> comparatorLambda2 = (a, b) -> {return a.compareTo(b);};

		System.out.println("Result with Lambda 3 : " + comparatorLambda2.compare(3, 2));

	}
}