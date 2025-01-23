package com.app.model;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private User user;

    public Order(int orderId, List<Product> products, User user) {
        this.orderId = orderId;
        this.products = products;
        this.user = user;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
