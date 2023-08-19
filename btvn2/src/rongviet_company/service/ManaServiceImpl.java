package rongviet_company.service;

import rongviet_company.entities.Manager;

import java.util.List;
import java.util.Scanner;

public class ManaServiceImpl implements IManage<Manager>{

    @Override
    public void add(Scanner scanner, List<Manager> managers) {
        System.out.println("Nhap thong tin trưởng phòng");
        System.out.println("Nhap tên");
        String name = scanner.nextLine();
        System.out.println("Nhập lương cơ bản");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Lương trách nhiệm");
        double responsibleSalary = Double.parseDouble(scanner.nextLine());
        double totalSalary = salary+responsibleSalary;
        Manager manager = new Manager(name,totalSalary,responsibleSalary);
        managers.add(manager);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void display(List<Manager> managers, Scanner scanner) {
        System.out.println("Nhap id trưởng phòng");
        int id = Integer.parseInt(scanner.nextLine());
        for (Manager mana:managers){
            if (id==mana.getId()) System.out.println(mana);
            else System.out.println("Khong tim thay");
        }
    }

    @Override
    public void delete(Scanner scanner, List<Manager> managers) {
        System.out.println("Nhap id trưởng phòng");
        int id = Integer.parseInt(scanner.nextLine());
        for (Manager mana:managers){
            if (id==mana.getId()) managers.remove(mana);
            else System.out.println("Khong tim thay");
        }
    }

    @Override
    public void edit(Scanner scanner, List<Manager> managers) {
        System.out.println("Nhap id trưởng phòng");
        int id = Integer.parseInt(scanner.nextLine());
        for (Manager mana:managers){
            if (id==mana.getId()) {
                System.out.println("Cập nhật lương mới");
                double newSalary = Double.parseDouble(scanner.nextLine());
                System.out.println("Cập nhật lương trách nhiệm mới");
                double newResponSalary= Double.parseDouble(scanner.nextLine());
                mana.setSalary(newSalary);
                mana.setResponsibleSalary(newResponSalary);
                System.out.println("Cập nhật thành công");
            }
            else System.out.println("Khong tim thay");
        }
    }
    public double calculateSalary(double salary, double responsibleSalary ){
        return salary+responsibleSalary;
    }
    public double calculateTaxes(double salary, double responsibleSalary){
        if (calculateSalary(salary,responsibleSalary)<11000000) return 0;
        else return (calculateSalary(salary,responsibleSalary)-11000000)*0.1;
    }
}
