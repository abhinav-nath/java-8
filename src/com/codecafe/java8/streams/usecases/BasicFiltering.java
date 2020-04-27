package com.codecafe.java8.streams.usecases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFiltering {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("ABC", "DEF", "GH", "IJKL", "MN", "OPQ");

        // filter strings with more than 2 characters
        System.out.println(strings.stream()
                                  .filter(s -> s.length() > 2)
                                  .collect(Collectors.toList()));

    }

}