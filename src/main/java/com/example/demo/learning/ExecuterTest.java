package com.example.demo.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        ExecutorService es1 = Executors.newFixedThreadPool(1);

        ExecutorService es3 = Executors.newScheduledThreadPool(1);

        ExecutorService es4 = Executors.newSingleThreadExecutor();

        ExecutorService es5 = Executors.newSingleThreadScheduledExecutor();

        es.submit(() -> {  System.out.println("Running task!"); } );



        es5.execute(() -> {
            System.out.println("Running task!");

        });

    }
}
