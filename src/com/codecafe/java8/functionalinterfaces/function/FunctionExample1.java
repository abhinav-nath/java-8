package com.codecafe.java8.functionalinterfaces.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Function is used for transformation
public class FunctionExample1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "pineapple", "banana", "watermelon", "strawberry", "cherry");

        Function<String, Integer> function = e -> e.length();

        List<Integer> lengths = map(list, function);

        System.out.println(lengths);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();

        for (T t : list)
            newList.add(function.apply(t));

        return newList;
    }

}
