package com.codecafe.java8.functionalinterfaces;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {
        FunctionalGenerics<String, String> fun1 = s -> s.substring(3, 7);
        System.out.println("substring : " + fun1.execute("HowCool"));

        FunctionalGenerics<String, Integer> fun2 = s -> s.length();
        System.out.println("length : " + fun2.execute("HowCool"));

        FunctionalGenerics<Integer, Integer> fun3 = n -> n * n;
        System.out.printf("square of %d : = %d", 5, fun3.execute(5));
    }

}