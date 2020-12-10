package com.codecafe.java8.functionalprogramming.higherorderfunctions;

public class HigherOrderFunctionDemo {

    public static void main(String[] args) {
        IFactory<Integer> factory = createFactory(() -> Math.random() * 100, Double::intValue);

        // or
        // IFactory<Integer> factory = createFactory(() -> Math.random() * 100, r -> r.intValue());

        Integer finishedProduct = factory.create();

        System.out.println(finishedProduct);
    }

    public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}