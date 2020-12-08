package com.codecafe.java8.functionalinterfaces.function.bifunction;

import java.util.function.BiFunction;

/*
   Accepts two input parameters of type T and U and returns
   an output of type R.
   
   T, U and R could be different or same.
   
   BiFunction also has the apply() method.

   public interface BiFunction<T, U, R> {
       R apply(T t, U u);
   }

 */

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction1 = (a, b) -> a + b;

        System.out.println("concatenated string : " + biFunction1.apply("hello", "world"));

        BiFunction<String, String, Integer> biFunction2 = (a, b) -> (a + b).length();

        System.out.println("length : " + biFunction2.apply("hello", "world"));
    }

}