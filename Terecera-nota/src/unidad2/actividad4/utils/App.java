package unidad2.actividad4.utils;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Student
        Student s1 = new Student("Ana", 4.1);
        Student s2 = new Student("ivan", 2.9);
        System.out.println(s1.getName() + ": " + s1.getGrade());
        System.out.println(s2.getName() + ": " + s2.getGrade());

        // Employee
        Employee e1 = new Employee("manager");
        Employee e2 = new Employee("developer");
        Employee e3 = new Employee("designer");

        System.out.println("Rol: " + e1.getRole());
        e1.showResponsibilities();

        System.out.println("Rol: " + e2.getRole());
        e2.showResponsibilities();

        System.out.println("Rol: " + e3.getRole());
        e3.showResponsibilities();

        // Product
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500000));
        products.add(new Product("Mouse", 200000));
        products.add(new Product("Teclado", 400000));
        products.add(new Product("Monitor", 300000));
        products.add(new Product("Impresora", 200000));

        for (Product p : products) {
            p.showInfo();
        }
    }
}