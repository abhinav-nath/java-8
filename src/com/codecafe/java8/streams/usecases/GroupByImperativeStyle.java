package com.codecafe.java8.streams.usecases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByImperativeStyle {

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
		
		Map<Integer, List<String>> personsByScore = new HashMap<>();
		
		for(String name : scoresOfPersons.keySet()) {
			
			int score = scoresOfPersons.get(name);
			
			List<String> names = new ArrayList<>();
			
			if(personsByScore.containsKey(score))
				names = personsByScore.get(score);
			
			names.add(name);
			personsByScore.put(score, names);
		}

		return personsByScore;
	}

}