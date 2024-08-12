package com.codefinity.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CalculationService {
    // Simulates calculating tax asynchronously
    public CompletableFuture<Double> calculateTax(Double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay();
            return amount * 0.15; // 15% tax
        });
    }

    // Simulates calculating shipping cost asynchronously
    public CompletableFuture<Double> calculateShipping(Double amount) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay();
            return amount * 0.1; // 10% shipping cost
        });
    }

    // Simulates a delay
    private void simulateDelay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
