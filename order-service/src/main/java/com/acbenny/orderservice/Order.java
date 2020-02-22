package com.acbenny.orderservice;

public class Order {
    private final int id;
    private final int customerId;
    private final String name;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Order(int id, int customerId, String name) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }
}
