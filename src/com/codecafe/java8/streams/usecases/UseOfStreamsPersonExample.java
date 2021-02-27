package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.codecafe.java8.streams.model.Gender;
import com.codecafe.java8.streams.model.Person;

public class UseOfStreamsPersonExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("John", Gender.MALE, 35),
                new Person("Charles", Gender.MALE, 75),
                new Person("Stacy", Gender.FEMALE, 28),
                new Person("Bruce", Gender.MALE, 38),
                new Person("Bulma", Gender.FEMALE, 39),
                new Person("Gohan", Gender.MALE, 25),
                new Person("Maggie", Gender.FEMALE, 34),
                new Person("John", Gender.MALE, 15),
                new Person("Rick", Gender.MALE, 39),
                new Person("Carol", Gender.FEMALE, 42),
                new Person("Nick", Gender.MALE, 20),
                new Person("Bob", Gender.MALE, 24),
                new Person("Gwen", Gender.FEMALE, 17),
                new Person("Jack", Gender.MALE, 37),
                new Person("Alexa", Gender.FEMALE, 18),
                new Person("Zachary", Gender.MALE, 27),
                new Person("John", Gender.MALE, 27),
                new Person("John", Gender.MALE, 32));

        System.out.println("count of people : " + people.size());

        // get the count of males
        long countOfMales = people.stream()
                                  .filter(person -> person.getGender() == Gender.MALE)
                                  .count();

        System.out.println("count of males : " + countOfMales);

        // get the distinct names of males
        List<String> namesOfDistinctMales = people.stream()
                                                  .filter(person -> person.getGender() == Gender.MALE)
                                                  .map(Person::getName)
                                                  .distinct()
                                                  .collect(Collectors.toList());

        System.out.println("distinct names of males : " + namesOfDistinctMales);

        // get the count of females
        long countOfFemales = people.stream()
                                    .filter(person -> person.getGender() == Gender.FEMALE)
                                    .count();

        System.out.println("count of females : " + countOfFemales);

        // get the names of all females
        List<String> allFemales = people.stream()
                                        .filter(person -> person.getGender() == Gender.FEMALE)
                                        .map(Person::getName)
                                        .collect(Collectors.toList());

        System.out.println("all females : " + allFemales);

        // get the names of all females above 25
        List<String> femalesAbove25 = people.stream()
                                            .filter(person -> person.getGender() == Gender.FEMALE && person.getAge() > 25)
                                            .map(Person::getName)
                                            .collect(Collectors.toList());

        System.out.println("females above 25 : " + femalesAbove25);

        // get the names of all males above 35 in upper case
        List<String> malesAbove35 = people.stream()
                                          .filter(person -> person.getGender() == Gender.MALE && person.getAge() > 35)
                                          .map(Person::getName)
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

        System.out.println("names of males above 35 in upper case : " + malesAbove35);

        // get the names of people sorted by their ages
        List<String> sortedByAge = people.stream()
                                         .sorted(Comparator.comparing(Person::getAge))
                                         .map(Person::getName)
                                         .collect(Collectors.toList());

        System.out.println("people sorted by age : " + sortedByAge);

        // get all people having name as John sorted by their age
        List<Person> johnsSortedByAge = people.stream()
                                              .filter(person -> "John".equals(person.getName()))
                                              .sorted(Comparator.comparing(Person::getAge))
                                              .collect(Collectors.toList());

        System.out.println("Johns sorted by age : " + johnsSortedByAge);

        // get the names of people sorted by their names
        List<String> sortedByName = people.stream()
                                          .sorted(Comparator.comparing(Person::getName))
                                          .map(Person::getName)
                                          .collect(Collectors.toList());

        System.out.println("people sorted by name : " + sortedByName);

        // get the names of people sorted by the length of their names
        List<String> sortedByLengthOfName = people.stream()
                                                  .sorted(Comparator.comparing(p -> p.getName().length()))
                                                  .map(Person::getName)
                                                  .collect(Collectors.toList());

        System.out.println("people sorted by length of name : " + sortedByLengthOfName);
    }

}