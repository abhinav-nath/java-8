package com.codecafe.java8.lambdas.foundation.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Style_Solution_1 {

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
        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }

        });


        System.out.println("print all elements in the list :");
        // Create a method that prints all the elements in the list
        printAll(people);


        System.out.println("\nprint all people having last name beginning with C :");
        // Create a method that prints all the people that have the last name beginning with C
        printLastNameBeginningWithC(people);

    }

    private static void printAll(List<Person> people) {

        for(Person p : people)
            System.out.println(p);

    }

    private static void printLastNameBeginningWithC(List<Person> people) {

        for(Person p : people) {
            if(p.getLastName().startsWith("C"))
                System.out.println(p);
        }

    }

}