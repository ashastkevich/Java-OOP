package org.example;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<Product>();

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public Basket() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
