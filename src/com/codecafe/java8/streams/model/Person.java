package com.codecafe.java8.streams.model;

public class Person {

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
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}