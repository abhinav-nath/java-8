package com.codecafe.java8.lambdas.constructorreference;

import java.util.function.Function;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        // Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable, Thread> threadGenerator = Thread::new; // constructor reference

        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        Thread th1 = threadGenerator.apply(task1);
        Thread th2 = threadGenerator.apply(task2);

        th1.start();
        th2.start();

        // more compact way of creating a task
        threadGenerator
        .apply(() -> System.out.println("Task 3 executed"))
        .start();
    }

}