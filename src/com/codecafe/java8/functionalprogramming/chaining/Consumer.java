package com.codecafe.java8.functionalprogramming.chaining;

import java.util.Objects;

// Custom Consumer

@FunctionalInterface
public interface Consumer<T> {

    // SAM
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> nextConsumer) {

        Objects.requireNonNull(nextConsumer);

        return (T t) -> {
            this.accept(t);
            nextConsumer.accept(t);
        };
    }

}