package com.codefinity;

import com.codefinity.service.CalculationService;
import com.codefinity.service.OrderService;
import com.codefinity.task.OrderProcessingExample;

import java.util.concurrent.ExecutionException;

public class RunnableApplication {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        new OrderProcessingExample(new OrderService(), new CalculationService()).processOrders();

        Thread.sleep(50000);
    }
}
