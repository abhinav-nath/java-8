package com.codecafe.java8.streams.usecases;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++)
			System.out.printf("isPrime(%d)? %b\n", i, isPrime(i));

	}

	private static boolean isPrime(int number) {

		return number > 1 &&
                IntStream.range(2, number)
                         .noneMatch(i -> number % i == 0);
	}

}