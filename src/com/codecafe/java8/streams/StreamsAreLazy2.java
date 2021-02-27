package com.codecafe.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAreLazy2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Intermediate operations will only be executed when a terminal operation is present
        // nothing will be printed
        numbers.stream()
               .filter(n -> {
                   System.out.println("filter: " + n);
                   return true;
               });


        // Let's extend the above example by the terminal operation forEach
        numbers.stream()
        .filter(n -> {
            System.out.println("filter: " + n);
            return true;
        })
        .forEach(n -> System.out.println("forEach: " + n));
        
        /* 
           OUTPUT
           filter 1
           forEach 1
           filter 2
           forEach 2
           filter 3
           forEach 3
           filter 4
           forEach 4
           filter 5
           forEach 5
         */

        /* The order of the result might be surprising.
         * A naive approach would be to execute the operations horizontally one after another on all elements of the stream.
         * But instead each element moves along the chain vertically.
         * The first string "d2" passes filter then forEach, only then the second string "a2" is processed.
         */
        
        /*
         * This behavior can reduce the actual number of operations performed on each element, as we see in the next example:
         */

        Stream.of("d2", "a2", "b1", "b3", "c")
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .anyMatch(s -> {
                  System.out.println("anyMatch: " + s);
                  return s.startsWith("A");
              });

        // map:      d2
        // anyMatch: D2
        // map:      a2
        // anyMatch: A2

        /* The operation anyMatch returns true as soon as the predicate applies to the given input element.
         * This is true for the second element passed "A2".
         * Due to the vertical execution of the stream chain, map has only to be executed twice in this case.
         * So instead of mapping all elements of the stream, map will be called as few as possible.
         */

    }
}