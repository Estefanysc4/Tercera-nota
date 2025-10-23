package unidad1.actividad5.company.hr.main;

import unidad1.actividad5.company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Ana", 2500, "Developer");
        Employee emp2 = new Employee("Carlos", 3000, "Manager");

        
        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + emp1.name);
        System.out.println("Rol: " + emp1.getRole());
        System.out.println("Salario: " + emp1.getSalary());

        System.out.println("\nEmpleado 2:");
        System.out.println("Nombre: " + emp2.name);
        System.out.println("Rol: " + emp2.getRole());
        System.out.println("Salario: " + emp2.getSalary());

       
        System.out.println("\n--- Aumentando salario de Ana ---");
        emp1.increaseSalary(500);
        System.out.println("Nuevo salario de Ana: " + emp1.getSalary());
    }
}
