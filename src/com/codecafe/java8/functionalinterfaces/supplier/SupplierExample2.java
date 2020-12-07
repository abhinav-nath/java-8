package com.codecafe.java8.functionalinterfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample2 {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "A String";

        System.out.println(supplier.get());
    }

}