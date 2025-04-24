package com.example.demo.learning;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TestMain {
    public static void main(String[] args) {
        //  Objects list -> array -> list
       List<Product> productList = new ArrayList<>(Product.getProducts());
       List<Employee> empList = new ArrayList<>(Employee.getEmployees());

       Product[] productArray = productList.toArray(Product[]::new);
       Employee[] empArray = empList.toArray(Employee[]::new);


    }

}
