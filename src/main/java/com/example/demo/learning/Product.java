package com.example.demo.learning;

import java.util.List;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public static List<Product> getProducts(){
        return List.of(
                new Product(1, "Laptop", 1200.00),
                new Product(2, "Smartphone", 800.00),
                new Product(3, "Tablet", 300.00),
                new Product(4, "Monitor", 200.00),
                new Product(5, "Monitor", 200.00)
        );
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }
}
