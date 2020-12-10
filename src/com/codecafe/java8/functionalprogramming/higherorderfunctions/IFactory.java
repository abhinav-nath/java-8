package com.codecafe.java8.functionalprogramming.higherorderfunctions;

@FunctionalInterface
public interface IFactory<T> {
    T create();
}