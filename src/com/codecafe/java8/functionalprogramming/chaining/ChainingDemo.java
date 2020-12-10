package com.codecafe.java8.functionalprogramming.chaining;

import java.util.function.Function;

public class ChainingDemo {

    public static void main(String[] args) {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = s -> System.out.println(s.length());

        Consumer<String> c4 = c1.thenAccept(c2);

        c4.accept("Chaining");

        // another example
        Function<Integer, Integer> f1 = n -> n + 2;
        Function<Integer, Integer> f2 = n -> n * 2;

        Function<Integer, Integer> f3 = f1.andThen(f2);

        System.out.println(f3.apply(10));

    }

}