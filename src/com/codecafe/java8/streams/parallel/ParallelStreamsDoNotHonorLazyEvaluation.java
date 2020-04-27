package com.codecafe.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;


public class ParallelStreamsDoNotHonorLazyEvaluation {

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


        System.out.println( "\nresult : " + people.parallelStream()  // analyze the behavior by toggling between sequential and parallel
                                                .filter(person -> person.getAge() > 25)  // this will be invoked more number of objects
                                                .filter(person -> person.getGender() == Gender.FEMALE)
                                                .map(Person::getName)
                                                .findAny()
                                                .orElse("no one found") );

    }

}

enum Gender { MALE, FEMALE }

class Person {

    private String name;
    private Gender gender;
    private int age;

    public Person(String theName, Gender theGender, int theAge) {
        this.name = theName;
        this.gender = theGender;
        this.age = theAge;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        System.out.println("age for " + name + " : " + age); // this will be invoked more number of objects
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
    }

}