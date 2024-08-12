package com.codefinity.service;

import com.codefinity.init.InitMap;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class OrderService {

    // Simulates fetching order amount asynchronously
    public CompletableFuture<Double> fetchOrderAmount(String orderId) {
        return CompletableFuture.supplyAsync(() -> {
            simulateDelay();
            return InitMap.getMapOrders().get(orderId); // Simulate order amount
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
