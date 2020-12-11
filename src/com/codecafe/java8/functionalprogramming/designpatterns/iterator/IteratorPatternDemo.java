package com.codecafe.java8.functionalprogramming.designpatterns.iterator;

/*
 * Iterator Pattern:
 * 
 * Accessing elements without exposing internal structure.
 */

public class IteratorPatternDemo {

    public static void main(String[] args) {

        MyArrayList list1 = new MyArrayList(new Object[] { 1, 2, 3, 4, 5 });
        list1.forEach(System.out::println);

        MyArrayList list2 = new MyArrayList(new Object[] { "ab", "bc", "cd", "de", "ef" });
        list2.forEach(System.out::println);
    }

}