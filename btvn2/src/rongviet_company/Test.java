package rongviet_company;

import rongviet_company.entities.Employee;
import rongviet_company.entities.Manager;
import rongviet_company.entities.MarketingStaff;
import rongviet_company.service.EmployeeServiceImpl;
import rongviet_company.service.ManaServiceImpl;
import rongviet_company.service.MktServiceImpl;
import rongviet_company.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        List<Employee> employees = new ArrayList<>();
        MktServiceImpl mktService = new MktServiceImpl();
        ManaServiceImpl manaService = new ManaServiceImpl();
        Menu menu = new Menu();
        int choice;
        do {
        menu.menu();
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("1. Nhân viên hành chính, 2. Nhân viên tiếp thị, 3. Trưởng phòng");
                System.out.println("Mời bạn chọn");
                int answer = Integer.parseInt(scanner.nextLine());
                switch (answer) {
                    case 1 -> employeeService.add(scanner, employees);
                    case 2 -> mktService.add(scanner, employees);
                    case 3 -> manaService.add(scanner, employees);
                    default -> System.out.println("Lựa chọn không hợp lệ");
                } break;
            case 2:
                employeeService.display(employees,scanner); break;
            case 3:
                employeeService.delete(scanner, employees); break;
            case 4:
                employeeService.findBySalary(scanner, employees);break;
            case 5:
                System.out.println("Bạn muốn sắp xếp: 1.Theo tên, 2.Theo thu nhập ");
                int answer1 = Integer.parseInt(scanner.nextLine());
                switch (answer1){
                    case 1:

                }
        }
    } while (choice!=7);
}}
