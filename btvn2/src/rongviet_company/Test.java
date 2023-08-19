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
        List<MarketingStaff> mktStaffs = new ArrayList<>();
        ManaServiceImpl manaService = new ManaServiceImpl();
        List<Manager> managers = new ArrayList<>();
        Menu menu = new Menu();
        menu.menu();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("1. Nhân viên hành chính, 2. Nhân viên tiếp thị, 3. Trưởng phòng");
                System.out.println("Mời bạn chọn");
                int answer = Integer.parseInt(scanner.nextLine());
                switch (answer) {
                    case 1 -> employeeService.add(scanner, employees);
                    case 2 -> mktService.add(scanner, mktStaffs);
                    case 3 -> manaService.add(scanner, managers);
                    default -> System.out.println("Lựa chọn không hợp lệ");
                } break;
            case 2:
                System.out.println("1. Nhân viên hành chính, 2. Nhân viên tiếp thị, 3. Trưởng phòng");
                System.out.println("Mời bạn chọn");
                int answer2 = Integer.parseInt(scanner.nextLine());
                switch (answer2) {
                    case 1 -> employeeService.display(employees,scanner);
                    case 2 -> mktService.display(mktStaffs,scanner);
                    case 3 -> manaService.display(managers,scanner);
                    default -> System.out.println("Lựa chọn không hợp lệ");
                } break;
            case 3:
                System.out.println("1. Nhân viên hành chính, 2. Nhân viên tiếp thị, 3. Trưởng phòng");
                System.out.println("Mời bạn chọn");
                int answer3 = Integer.parseInt(scanner.nextLine());
                switch (answer3) {
                    case 1 -> employeeService.delete(scanner, employees);
                    case 2 -> mktService.delete(scanner, mktStaffs);
                    case 3 -> manaService.delete(scanner, managers);
                    default -> System.out.println("Lựa chọn không hợp lệ");
                } break;
            case 4:
                System.out.println("1. Nhân viên hành chính, 2. Nhân viên tiếp thị, 3. Trưởng phòng");
                System.out.println("Mời bạn chọn");
                int answer4 = Integer.parseInt(scanner.nextLine());
                switch (answer4) {
                    case 1 -> employeeService.findBySalary(scanner, employees);
                    case 2 -> mktService.findBySalary(scanner, mktStaffs);
                    case 3 -> manaService.findBySalary(scanner, managers);
                    default -> System.out.println("Lựa chọn không hợp lệ");
                } break;
        }
    }
}
