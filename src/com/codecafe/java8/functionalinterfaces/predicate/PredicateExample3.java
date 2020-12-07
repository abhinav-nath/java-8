package com.codecafe.java8.functionalinterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Goal is to make the filterList method generic
 * so that the filterList method can work with any datatype
 */
public class PredicateExample3 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 4, 5, 5, 5, 6);

        Predicate<Integer> evenFilter = e -> e % 2 == 0;

        List<Integer> newList = filterList(list, evenFilter);

        System.out.println("list - " + list);
        System.out.println("newList - " + newList);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t))
                newList.add(t);
        }

        return newList;
    }

}