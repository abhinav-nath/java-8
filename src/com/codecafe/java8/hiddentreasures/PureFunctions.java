package com.codecafe.java8.hiddentreasures;

import java.util.Arrays;
import java.util.List;

public class PureFunctions {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

        // find the double of the first number > 3 and is even

        for (int number : numbers) {
            if (isGT3(number) && isEven(number)) {
                System.out.println("result : " + doubleIt(number));
                break;
            }
        }
    }

    public static boolean isGT3(int number) {
        System.out.println("isGT3 called for number " + number);
        if (number > 3)
            return true;
        else
            return false;
    }

    public static int doubleIt(int number) {
        System.out.println("doubleIt called for number " + number);
        return number * 2;
    }

    public static boolean isEven(int number) {
        System.out.println("isEven called for number " + number);
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

}