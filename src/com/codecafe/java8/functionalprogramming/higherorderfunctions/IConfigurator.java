package com.codecafe.java8.functionalprogramming.higherorderfunctions;

@FunctionalInterface
public interface IConfigurator<T, R> {
    R configure(T t);
}