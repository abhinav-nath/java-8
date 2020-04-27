package com.codecafe.java8.lambdas.foundation.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java7Style_Solution_2 {

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


        System.out.println("1 print all elements in the list :");
        // Create a method that prints all the elements in the list
        printAll(people);


        // or we can also use
        System.out.println("\n2 print all elements in the list :");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return true;
            }
        });


        System.out.println("\nprint all people having last name beginning with C :");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });


        System.out.println("\nprint all people having first name beginning with T :");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("T");
            }
        });


        System.out.println("\nprint all people having age between 20 and 50 :");
        printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return (p.getAge() >= 20 && p.getAge() <= 50);
            }
        });

    }

    private static void printAll(List<Person> people) {

        for(Person p : people)
            System.out.println(p);

    }

    private static void printConditionally(List<Person> people, Condition condition) {

        for(Person p : people) {
            if(condition.test(p))
                System.out.println(p);
        }
    }

}


interface Condition {
    // method which looks at a person and decides whether that person should be included or not
    boolean test(Person p);
}