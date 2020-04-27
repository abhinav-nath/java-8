package com.codecafe.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesAreImmortal {

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> 2);
    }

    public static void main(String[] args) {

        create()
           .thenAccept(data -> System.out.println(data))  // this returns void CompletableFuture
           .thenRun(() -> System.out.println("This never dies")) // Runnable
           .thenRun(() -> System.out.println("Really, this never dies"))
           .thenRun(() -> System.out.println("Really, really, this never dies"));

    }
}