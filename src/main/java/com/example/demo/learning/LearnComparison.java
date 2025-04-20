package com.example.demo.learning;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnComparison {
    public static void main(String[] args) {
        LearnComparison l = new LearnComparison();




        double[] arr = {1.0, 2.0, 3.0, 4.0};
        l.getNumber(arr);



        //List<Employee>  employeeList = List.of(emp1, emp2, emp3, emp4);
        List<Employee>  employeeList =Employee.getEmployees();

        int countIT = employeeList.stream().filter(e -> Objects.equals(e.getDepartment(), "IT")).mapToInt(e -> 1).sum();
        System.out.println("Count of IT employees: " + countIT);

        System.out.println("Before sorting:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }


        employeeList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public double getNumber(double[] arr) {
        int[] numbers = new int[] { 1, 2, 3 };
        List<Integer> lst = Arrays.stream(numbers).boxed().toList();
        int[] numbers2 = lst.stream().mapToInt(i->i).toArray();

        Employee[] err = Employee.getEmployees().toArray(Employee[]::new);

        List<Employee> el = Arrays.stream(err).toList();
        Employee[] err2 = el.toArray(new Employee[0]);
        Employee[] err3 = el.toArray(Employee[]::new);

        System.out.println("ERR2: " + err2.length);
        System.out.println("ERR3: " + err3.length);

    return 2.0;
    }
}


