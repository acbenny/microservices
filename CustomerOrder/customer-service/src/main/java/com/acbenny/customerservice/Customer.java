package com.acbenny.customerservice;

public class Customer {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
