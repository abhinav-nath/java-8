package com.codecafe.java8.functionalinterfaces.function.bifunction;

import java.util.function.BinaryOperator;

/*
   It is a specialization of BiFunction.
   
   <T> the type of the operands and result of the operator.
  
   public interface BinaryOperator<T> extends BiFunction<T,T,T> {

   }

 */

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<String> operator = (a, b) -> a + "." + b;

        System.out.println("concatenated string : " + operator.apply("hello", "world"));
    }

}