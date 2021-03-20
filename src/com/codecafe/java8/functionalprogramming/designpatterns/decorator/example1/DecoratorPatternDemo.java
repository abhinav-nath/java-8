package com.codecafe.java8.functionalprogramming.designpatterns.decorator.example1;

import java.util.function.Function;

public class DecoratorPatternDemo {

    public static void printIt(int n, String msg, Function<Integer, Integer> func) {
        System.out.println(n + " " + msg + " : " + func.apply(n));
    }

    public static void main(String[] args) {

        Function<Integer, Integer> inc = e -> e + 1;
        printIt(5, "incremented", inc);
        printIt(10, "incremented", inc);

        Function<Integer, Integer> doubled = e -> e * 2;
        printIt(5, "doubled", doubled);
        printIt(10, "doubled", doubled);

        // disaster alert !!
        Function<Integer, Integer> incAndDoubled = e -> (e + 1) * 2;
        printIt(5, "incremented and doubled", incAndDoubled);
        printIt(10, "incremented and doubled", incAndDoubled);

        // right way
        printIt(5, "incremented and doubled", inc.andThen(doubled));
        printIt(10, "incremented and doubled", inc.andThen(doubled));
    }

}