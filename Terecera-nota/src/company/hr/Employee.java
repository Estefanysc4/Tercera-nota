package company.hr;

public class Employee {
   
    public String name;       
    private double salary;    
    protected String role;    
   
    public Employee(String name, double salary, String role) {
        this.name = name;
        setSalary(salary); 
        this.role = role;
    }

   
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor que 0. No se actualizó.");
        }
    }

   
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   
    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Salario aumentado en " + amount);
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }
}
