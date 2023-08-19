package rongviet_company.entities;

public class Employee {
    private static int autoID;
    protected int id;
    protected String name;
    protected double salary;

    public Employee(String name,double salary) {
        this.name = name;
        this.id =++autoID;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
