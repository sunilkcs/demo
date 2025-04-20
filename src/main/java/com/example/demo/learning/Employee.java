package com.example.demo.learning;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;

    private double salary;

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "John Doe", 30, "Engineering", 10.3),
                new Employee(2, "Jane Smith", 25, "Marketing", 34.5),
                new Employee(3, "Sunil", 35, "Sales", 20.6),
                new Employee(4, "Sunil", 30, "IT", 5.8)
        );
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
