package rongviet_company.service;

import rongviet_company.entities.Employee;
import rongviet_company.entities.MarketingStaff;

import java.util.List;
import java.util.Scanner;

public class MktServiceImpl implements IManage<Employee> {
    @Override
    public void add(Scanner scanner, List<Employee>employees) {
        System.out.println("Nhap thong tin nhan vien tiep thi");
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap luong co ban");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Doanh thu ban hang");
        double kpi = Double.parseDouble(scanner.nextLine());
        System.out.println("Phan tram hoa hong");
        double bonus = Double.parseDouble(scanner.nextLine());
        double totalSalary = salary+kpi+(bonus/100*kpi);
        MarketingStaff staff = new MarketingStaff(name,totalSalary,kpi,bonus);
        employees.add(staff);
        System.out.println("Them thanh cong nhan vien tiep thi");
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


    public double calculateSalary(double salary, double kpi, double bonusPercent){
         return salary+kpi+(bonusPercent/100*kpi);
    }
public double calculateTaxes(double salary, double kpi, double bonusPercent){
        if (calculateSalary(salary,kpi,bonusPercent)<11000000) return 0;
        else return (calculateSalary(salary,kpi,bonusPercent)-11000000)*0.1;
}
}
