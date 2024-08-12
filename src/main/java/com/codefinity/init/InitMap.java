package com.codefinity.init;

import java.util.HashMap;
import java.util.Map;

public class InitMap {
    private static final Map<String, Double> mapOrders = Map.of(
            "order1", 300.00,
            "order2", 120.00,
            "order3", 180.00
    );

    public static Map<String, Double> getMapOrders() {
        return mapOrders;
    }
}
