package com.codecafe.java8.lambdas.foundation.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Using Consumer interface
public class Java8Style_Solution_3 {

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
        performConditionally(people, p -> true, p -> System.out.println(p));

        System.out.println("\nprint all people having last name beginning with C :");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("\nprint all people having first name beginning with T :");
        performConditionally(people, p -> p.getFirstName().startsWith("T"), p -> System.out.println(p));

        System.out.println("\nprint the first name of people having age between 20 and 50 :");
        // Passing a different behavior
        performConditionally(people, p -> p.getAge() >= 20 && p.getAge() <= 50, p -> System.out.println(p.getFirstName()));

    }


    // Accepting a Consumer to perform the behavior passed in to it
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if(predicate.test(p))
                consumer.accept(p);;
        }
    }
}