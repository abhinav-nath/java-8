package com.codecafe.java8.functionalprogramming.tco;

// Tail Call Optimization
public class TCO_Demo {

    public static void main(String[] args) {
        // int fact = reFact(5);
        int fact = tailReFact(5, 1);
        System.out.println(fact);
    }

    private static int reFact(int n) {
        if (n <= 1)
            return 1;
        else
            return n * reFact(n - 1);
    }

    // n -> input number
    // a -> to accumulate the product
    private static int tailReFact(int n, int a) {
        if (n <= 1)
            return a;
        else
            return tailReFact(n - 1, n * a);
    }
}