package com.codecafe.java8.hiddentreasures;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

/*
   A Simple task is to print all strings in the list in UPPERCASE and separated by comma.
 */

public class PrintListElements {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Jerry", "Jim", "John");

        // imperative style of programming
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i).toUpperCase());
            if (i != names.size() - 1)
                System.out.print(", ");
        }

        System.out.println();

        // decalarative style of programming
        System.out.println(names.stream()
                                .map(String::toUpperCase)
                                .collect(joining(", ")));
    }

}