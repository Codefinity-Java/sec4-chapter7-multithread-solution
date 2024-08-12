package com.codefinity.init;

import java.util.HashMap;
import java.util.Map;

public class InitMap {
    private final Map<String, Double> mapOrders = new HashMap<>();

    public InitMap() {
        mapOrders.put("order1", 300.00);
        mapOrders.put("order2", 120.00);
        mapOrders.put("order3", 180.00);
    }

    public Map<String, Double> getMapOrders() {
        return mapOrders;
    }
}
