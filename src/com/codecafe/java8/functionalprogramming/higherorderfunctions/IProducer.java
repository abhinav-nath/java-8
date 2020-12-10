package com.codecafe.java8.functionalprogramming.higherorderfunctions;

@FunctionalInterface
public interface IProducer<T> {
    T produce();
}