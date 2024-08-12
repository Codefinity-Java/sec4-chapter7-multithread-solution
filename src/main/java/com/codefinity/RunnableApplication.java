package com.codefinity;

import com.codefinity.task.OrderProcessingExample;

import java.util.concurrent.ExecutionException;

public class RunnableApplication {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        new OrderProcessingExample().processOrders();

        Thread.sleep(50000);
    }
}
