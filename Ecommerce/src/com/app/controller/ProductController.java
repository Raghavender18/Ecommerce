package com.app.controller;

import com.app.model.Product;
import com.app.service.ProductService;

public class ProductController {
    private ProductService productService = new ProductService();

    public void addProduct(int id, String name, double price) {
        productService.addProduct(new Product(id, name, price));
    }

    public void displayProducts() {
        productService.getAllProducts().forEach(product ->
                System.out.println("Product ID: " + product.getId() +
                                   ", Name: " + product.getName() +
                                   ", Price: $" + product.getPrice()));
    }
}
