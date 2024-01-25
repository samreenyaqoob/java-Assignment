package org.example;

public class Employee {
    private String name;
    private double salary;
    private date hiredate;

    public String getName() {
        return name;
    }

    public date getHiredate() {
        return hiredate;
    }

    public void setHiredate(date hiredate) {
        this.hiredate = hiredate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary, date hiredate) {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }
}
