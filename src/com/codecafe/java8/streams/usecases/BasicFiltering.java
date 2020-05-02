package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFiltering {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("ABC", "DEF", "GH", "", "IJKL", "MN", "", "OPQ", "");
        System.out.println("original list : " + strings);

        // filter strings with more than 2 characters
        System.out.println("strings with more than 2 characters : " + strings.stream()
                                                                             .filter(s -> s.length() > 2)
                                                                             .collect(Collectors.toList()));

        // find the count of empty strings
        System.out.println("count of empty strings : " + strings.stream()
                                                                .filter(s -> s.isEmpty())
                                                                .count());

        // remove all empty strings from the list
        List<String> filtered = strings.stream()
                                       .filter(s -> !s.isEmpty())
                                       .collect(Collectors.toList());

        System.out.println("list without empty strings : " + filtered);
    }

}