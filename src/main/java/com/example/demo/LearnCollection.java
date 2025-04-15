package com.example.demo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class LearnCollection {
    public static void main(String[] args) {
        List<Integer> li = List.of(34,33,56);

        // Consumer lambda
        Consumer<Integer> consumerMethod = num -> {
            System.out.println("Consumer Lambda: " + num);
        };

        // Predicate lambda
        Predicate<Integer> predicateMethod = num -> {
            return num % 2 == 0;
        };

        //Supplier Lambda
        Supplier<Integer> suppliedMethod = () -> {
            return ThreadLocalRandom.current().nextInt(10, 20);
        };

    }
}
