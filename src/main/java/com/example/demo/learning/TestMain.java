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

       List<Product> productList1 = Arrays.stream(productArray).toList();
       List<Employee> empList1 = Arrays.stream(empArray).toList();

       List<Integer> li = Arrays.asList(16, 12, 33, 24, 5);
       List<Integer> filteredInts = li.stream().collect(Collectors.teeing(
               minBy(Comparator.naturalOrder()),
               maxBy(Comparator.naturalOrder()),
               (min, max) -> min.orElse(0) + max.orElse(0)
       ));

       List<Person> persons = empList.stream().collect(Collectors.collectingAndThen())

       Map<Integer, Double> result = empList.stream().collect(
               groupingBy(Employee::getAge, Collectors.mapping(Employee::getSalary, Collectors.summingDouble(Double::doubleValue))));

        System.out.println("RESULT: " + result);

        result.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });

    }
}
