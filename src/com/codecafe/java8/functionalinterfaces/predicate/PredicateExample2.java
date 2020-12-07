package com.codecafe.java8.functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Goal is to the take a list with multiple strings
 * and return a new list containing elements that match a given string
 */
public class PredicateExample2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "", "YouTube", "", "HelloWorld");

        Predicate<String> predicate = s -> s.contains("Hello");

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