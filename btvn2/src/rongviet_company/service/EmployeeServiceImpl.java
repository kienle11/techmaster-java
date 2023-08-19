package rongviet_company.service;

import rongviet_company.entities.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IManage<Employee> {
    @Override
    public void add(Scanner scanner, List<Employee> employees) {
        System.out.println("Nhap thong tin nhan vien hanh chinh");
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhập lương");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name,salary);
        employees.add(employee);
    }

    @Override
    public void display(List<Employee> employees, Scanner sc) {
        System.out.println("Nhap id nhan vien");
        int id = Integer.parseInt(sc.nextLine());
        for (Employee empl: employees){
        if (id==empl.getId()) System.out.println(empl);
        else System.out.println("Khong tim thay nhan vien");
        }
    }

    @Override
    public void delete(Scanner sc,List<Employee>employees) {
        System.out.println("Nhap id nhan vien");
        int id = Integer.parseInt(sc.nextLine());
        for (Employee empl: employees){
            if (id==empl.getId()) employees.remove(empl);
            else System.out.println("Khong tim thay nhan vien");
        }
    }

    @Override
    public void edit(Scanner scanner,List<Employee>employees) {
        System.out.println("Nhap id nhan vien ban muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee empl: employees){
            if (id==empl.getId()){
                System.out.println("Nhap ten moi");
                String newName = scanner.nextLine();
                System.out.println("Nhap luong moi");
                double newSalary = Double.parseDouble(scanner.nextLine());
                empl.setName(newName);
                empl.setSalary(newSalary);
                System.out.println("Chinh sua thanh cong");
            } else System.out.println("Khong tim thay");
        }
    }
    public double calculateTaxes(double salary){
        if (salary<11000000) return 0;
        return salary*0.1;
    }
public double calculateSalary(double salary){
        return salary;
}
}
