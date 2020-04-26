package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

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
				new Person("Zachary", Gender.MALE, 27));
		
		System.out.println("count of people : " + people.size());
		
		// get the count of males
        long countOfMales = people.stream()
                                  .filter(person -> person.getGender() == Gender.MALE)
                                  .count();
		
		System.out.println("count of males : " + countOfMales);
		
		// get the count of females
        long countOfFemales = people.stream()
                                    .filter(person -> person.getGender() == Gender.FEMALE)
                                    .count();
		
		System.out.println("count of females : " + countOfFemales);

		// get the names of all females
        List<String> allFemales = people.stream()
                                        .filter(person -> person.getGender() == Gender.FEMALE)
                                        .map(person -> person.getName())
                                        .collect(toList());

		System.out.println("all females : " + allFemales);

		// get the names of all females above 25
        List<String> femalesAbove25 = people.stream()
                                            .filter(person -> person.getGender() == Gender.FEMALE && person.getAge() > 25)
                                            .map(person -> person.getName())
                                            .collect(toList());

		System.out.println("females above 25 : " + femalesAbove25);

		// get the names of all males above 35 in upper case
        List<String> malesAbove35 = people.stream()
                                          .filter(person -> person.getGender() == Gender.MALE && person.getAge() > 35)
                                          .map(person -> person.getName())
                                          .map(name -> name.toUpperCase())
                                          .collect(toList());
		
		System.out.println("names of males above 35 in upper case : " + malesAbove35);
	}

}