package com.codecafe.java8.lambdas.foundation.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8Style_Solution_1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Rick", "Grimes", 40),
				new Person("Daryl", "Dixon", 38),
				new Person("Clark", "Kent", 41),
				new Person("Tom", "Cruise", 57),
				new Person("Judith", "Grimes", 10),
				new Person("Tony", "Stark", 43),
				new Person("Son", "Goku", 80),
				new Person("Tom", "Holland", 25),
				new Person("Jim", "Carrey", 58)
				);

		// Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("print all elements in the list :");
		printConditionally(people, p -> true);

		System.out.println("\nprint all people having last name beginning with C :");
		printConditionally(people, p -> p.getLastName().startsWith("C"));

		System.out.println("\nprint all people having first name beginning with T :");
		printConditionally(people, p -> p.getFirstName().startsWith("T"));

		System.out.println("\nprint all people having age between 20 and 50 :");
		printConditionally(people, p -> p.getAge() >= 20 && p.getAge() <= 50);

	}


	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
}