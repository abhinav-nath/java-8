package com.codecafe.java8.streams.usecases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class GroupByFunctionalStyle {

	public static void main(String[] args) {

		Map<String, Integer> scoresOfPersons = new HashMap<>();

		scoresOfPersons.put("Jack", 12);
		scoresOfPersons.put("Jill", 15);
		scoresOfPersons.put("Tom", 11);
		scoresOfPersons.put("Darla", 15);
		scoresOfPersons.put("Nick", 15);
		scoresOfPersons.put("Nancy", 11);

		System.out.println(groupByScores(scoresOfPersons));

	}

	private static Map<Integer, List<String>> groupByScores(Map<String, Integer> scoresOfPersons) {
		
		return scoresOfPersons.keySet()
				              .stream()
				              .collect(groupingBy(scoresOfPersons::get));
	}

}