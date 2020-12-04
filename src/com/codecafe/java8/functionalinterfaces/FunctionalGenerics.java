package com.codecafe.java8.functionalinterfaces;

/* a functional interface with type parameters T and R
 * execute method accepts a value of type T and returns a value of type R
 */
@FunctionalInterface
public interface FunctionalGenerics<T, R> {
    public R execute(T t);
}