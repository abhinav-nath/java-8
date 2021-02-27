package com.codecafe.java8.streams;

import java.util.stream.Stream;

public class OrderOfExecution {

    public static void main(String[] args) {

        // two intermediate operations - map & filter

        Stream.of("d2", "a2", "b1", "b3", "c")
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("A");
              })
              .forEach(s -> System.out.println("forEach: " + s));

        // map:     d2
        // filter:  D2
        // map:     a2
        // filter:  A2
        // forEach: A2
        // map:     b1
        // filter:  B1
        // map:     b3
        // filter:  B3
        // map:     c
        // filter:  C

        System.out.println("---------");

        // Both map and filter are called five times for every string in the underlying collection whereas forEach is only called once.

        // We can greatly reduce the actual number of executions if we change the order of the operations, moving filter to the beginning of the chain:

        Stream.of("d2", "a2", "b1", "b3", "c")
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("a");
              })
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .forEach(s -> System.out.println("forEach: " + s));

        // filter:  d2
        // filter:  a2
        // map:     a2
        // forEach: A2
        // filter:  b1
        // filter:  b3
        // filter:  c

        // Now, map is only called once so the operation pipeline performs much faster for larger numbers of input elements.
        // Keep that in mind when composing complex method chains.

        // Let's extend the above example by an additional operation, sorted:

        Stream.of("d2", "a2", "b1", "b3", "c")
              .sorted((s1, s2) -> {
                  System.out.printf("sort: %s; %s\n", s1, s2);
                  return s1.compareTo(s2);
              })
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("a");
              })
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .forEach(s -> System.out.println("forEach: " + s));

        // Sorting is a special kind of intermediate operation.
        // It's a so called stateful operation since in order to sort a collection of elements you have to maintain state during ordering.

        /* output
        sort:    b1; a2
        sort:    b1; d2
        sort:    b1; a2
        sort:    b3; b1
        sort:    b3; d2
        sort:    c; b3
        sort:    c; d2
        filter:  a2
        map:     a2
        forEach: A2
        filter:  b1
        filter:  b3
        filter:  c
        filter:  d2
         */

        // First, the sort operation is executed on the entire input collection.
        // In other words sorted is executed horizontally.
        // So in this case sorted is called eight times for multiple combinations on every element in the input collection.

        // Once again we can optimize the performance by reordering the chain:

        Stream.of("d2", "a2", "b1", "b3", "c")
              .filter(s -> {
                  System.out.println("filter: " + s);
                  return s.startsWith("a");
              })
              .sorted((s1, s2) -> {
                  System.out.printf("sort: %s; %s\n", s1, s2);
                  return s1.compareTo(s2);
              })
              .map(s -> {
                  System.out.println("map: " + s);
                  return s.toUpperCase();
              })
              .forEach(s -> System.out.println("forEach: " + s));

        // filter:  d2
        // filter:  a2
        // filter:  b1
        // filter:  b3
        // filter:  c
        // map:     a2
        // forEach: A2

        // In this example sorted is never been called because filter reduces the input collection to just one element.
        // So the performance is greatly increased for larger input collections.
    }

}