package rongviet_company.service;

import rongviet_company.entities.Employee;
import rongviet_company.entities.Manager;
import rongviet_company.entities.MarketingStaff;

import java.util.List;
import java.util.Scanner;

public class ManaServiceImpl implements IManage<Employee>{

    @Override
    public void add(Scanner scanner, List<Employee>employees) {
        System.out.println("Nhap thong tin trưởng phòng");
        System.out.println("Nhap tên");
        String name = scanner.nextLine();
        System.out.println("Nhập lương cơ bản");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Lương trách nhiệm");
        double responsibleSalary = Double.parseDouble(scanner.nextLine());
        double totalSalary = salary+responsibleSalary;
        Manager manager = new Manager(name,totalSalary,responsibleSalary);
        employees.add(manager);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display(List<Employee> list, Scanner scanner) {

    }

    @Override
    public void delete(Scanner scanner, List<Employee> T) {

    }

    @Override
    public void edit(Scanner scanner, List<Employee> T) {

    }


    public double calculateSalary(double salary, double responsibleSalary ){
        return salary+responsibleSalary;
    }
    public double calculateTaxes(double salary, double responsibleSalary){
        if (calculateSalary(salary,responsibleSalary)<11000000) return 0;
        else return (calculateSalary(salary,responsibleSalary)-11000000)*0.1;
    }
}
