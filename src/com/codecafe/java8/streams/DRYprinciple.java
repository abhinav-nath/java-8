package com.codecafe.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// DRY - Don't Repeat Yourself Principle
public class DRYprinciple {

	public static void main(String[] args) {

		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

		final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

		// filter out names that start with a certain letter
		final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();

		final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();

		final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();

		/*
		 The lambda expressions make the code concise, but quietly lead to duplicate
		 code. In the previous example, one change to the lambda expression needs
		 to change in more than one place - that's a no-no. Fortunately, we can assign
		 lambda expressions to variables and reuse them, just like with objects.

		 The filter() method, the receiver of the lambda expression in the previous
		 example, takes a reference to a java.util.function.Predicate functional interface.
		 Here, the Java compiler works its magic to synthesize an implementation of
		 the Predicate's test() method from the given lambda expression. Rather than
		 asking Java to synthesize the method at the argument-definition location, we
		 can be more explicit.

		 In this example, it's possible to store the lambda
		 expression in an explicit reference of type Predicate and then pass it to the
		 function; this is an easy way to remove the duplication.
		 Let's refactor the previous code to make it DRY.
		 */
		
		final Predicate<String> startsWith = name -> name.startsWith("N");
		
		final long countFriends = friends.stream().filter(startsWith).count();

		final long countEditors = editors.stream().filter(startsWith).count();

		final long countComrades = comrades.stream().filter(startsWith).count();
		
		System.out.println("countFriends : " + countFriends +  " countEditors : " + countEditors + " countComrades : " + countComrades );
		
		/*
		  Rather than duplicating the lambda expression several times, we created it once
		  and stored it in a reference named startsWith of type Predicate. In the three calls
	      to the filter() method, the Java compiler happily took the lambda expression
		  stored in the variable under the guise of the Predicate instance.
		  
		  Furthermore, we can change Predicate to start with "A" and it will be reflected in all the three streams !
		 */
	}

}