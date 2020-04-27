package com.codecafe.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesBasicDemo {

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> 2);
    }
    
    public static void main(String[] args) {
        
        CompletableFuture<Integer> future = create();

        // this is how to translate it
        // I have a future object, when the future resolves, then accept the result given by it
        future.thenAccept(data -> System.out.println(data));
    }
}