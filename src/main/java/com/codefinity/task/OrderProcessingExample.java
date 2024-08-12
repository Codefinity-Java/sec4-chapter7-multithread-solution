package com.codefinity.task;

import com.codefinity.init.InitMap;
import com.codefinity.service.CalculationService;
import com.codefinity.service.OrderService;

import java.util.concurrent.CompletableFuture;

public class OrderProcessingExample {
    private final OrderService orderService = new OrderService();
    private final CalculationService calculationService = new CalculationService();

    public void processOrders() {

        // Process each order asynchronously
        for (String orderId : InitMap.getMapOrders().keySet()) {
            CompletableFuture<Double> orderAmountFuture = orderService.fetchOrderAmount(orderId);

            CompletableFuture<Double> taxFuture = orderAmountFuture.thenCompose(calculationService::calculateTax);
            CompletableFuture<Double> shippingFuture = orderAmountFuture.thenCompose(calculationService::calculateShipping);

            CompletableFuture<Double> totalFuture = taxFuture.thenCombine(shippingFuture, Double::sum);
            CompletableFuture<Double> finalTotalFuture = orderAmountFuture.thenCombine(totalFuture, Double::sum);

            // Print the final total for each order
            finalTotalFuture.thenAccept(finalTotal -> {
                System.out.println("Final total for " + orderId + ": " + finalTotal);
            });
        }
    }
}
