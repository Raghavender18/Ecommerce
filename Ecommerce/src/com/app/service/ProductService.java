package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Product;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public List<Product> getAllProducts() {
    	System.out.println("added by sample 1");
    	System.out.println("added by sample 2 ");
        return products;
    }
}
