package com.codecafe.java8.lambdas.foundation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Before Java 8, the only way to partially support closures in Java was by using anonymous inner classes.
 * But the syntax of anonymous classes may seem unwieldy and unclear.
 * With Java 8, most uses of anonymous inner classes should be replaced by lambdas to highly increase the readability of the source code.
 */

public class SortStrings {

    public static void main(String[] args) {

        List<String> words1 = Arrays.asList("ab", "abcd", "abc", "abcde", "a", "abcdef");

        Collections.sort(words1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println(words1);

        List<String> words2 = Arrays.asList("ab", "abcd", "abc", "abcde", "a", "abcdef");

        Collections.sort(words2, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(words2);
    }

}