package com.codecafe.java8.functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Goal is to the take a list with empty strings
 * and return a new list without empty strings
 */
public class PredicateExample1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("The", "", "Walking", "", "Dead");

        Predicate<String> predicate = s -> !s.isEmpty();

        List<String> newList = filterList(list, predicate);

        System.out.println("list - " + list);
        System.out.println("newList - " + newList);
    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
        List<String> newList = new ArrayList<>();

        for (String string : list) {
            if (predicate.test(string))
                newList.add(string);
        }

        return newList;
    }

}