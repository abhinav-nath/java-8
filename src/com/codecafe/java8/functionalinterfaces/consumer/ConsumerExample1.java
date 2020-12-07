package com.codecafe.java8.functionalinterfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(34, 67, 8, 23, 67, 89, 90);

        // implementation of the Consumer's accept method
        Consumer<Integer> consumer = e -> System.out.println(e);

        printElements(list, consumer);

        System.out.println();

        // or call this directly
        printElements(list, System.out::println);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t : list)
            consumer.accept(t);
    }

}