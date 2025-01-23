package com.app.controller;

import java.util.List;

import com.app.model.Order;
import com.app.model.Product;
import com.app.model.User;
import com.app.service.OrderService;

public class OrderController {
    private OrderService orderService = new OrderService();

    public void addOrder(int orderId, List<Product> products, User user) {
        orderService.addOrder(new Order(orderId, products, user));
    }

    public void displayOrders() {
        orderService.getAllOrders().forEach(order ->
                System.out.println("Order ID: " + order.getOrderId() +
                                   ", User: " + order.getUser().getName() +
                                   ", Product Count: " + order.getProducts().size()));
    }
}
