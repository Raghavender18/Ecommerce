package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Order;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added with ID: " + order.getOrderId());
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
