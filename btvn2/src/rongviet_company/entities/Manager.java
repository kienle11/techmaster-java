package rongviet_company.entities;

import rongviet_company.entities.Employee;

public class Manager extends Employee {
    private double responsibleSalary;
    public Manager(String name, double salary,double responsibleSalary) {
        super(name, salary);
        this.responsibleSalary =responsibleSalary;
    }

    public void setResponsibleSalary(double responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    @Override
    public String toString() {
        return "Manager " + id+". "+name+
                ". ResponsibleSalary:" + responsibleSalary +
                ", salary: " + salary;
    }
}
