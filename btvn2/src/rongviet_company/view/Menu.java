package rongviet_company.view;

import rongviet_company.entities.Employee;
import rongviet_company.service.EmployeeServiceImpl;
import rongviet_company.service.ManaServiceImpl;
import rongviet_company.service.MktServiceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("Chương trình quản lý nhân sự Công ty Rồng Việt");
        System.out.println("1. Nhập danh sách nhân viên");
        System.out.println("2. Hiển thị danh sách nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Tìm kiếm nhân viên theo lương");
        System.out.println("5. Sắp xếp nhân viên theo họ tên hoặc thu nhập");
        System.out.println("6. Hiện thị 5 nhân viên có thu nhập cao nhất công ty");
    }
    public void menuSelect(int choice, Scanner scanner, List<Employee>employees, EmployeeServiceImpl employeeService
    , MktServiceImpl mktService, ManaServiceImpl manaService){
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
                switch (answer1) {
                    case 1 -> {
                        employees.sort(new Comparator<Employee>() {
                            @Override
                            public int compare(Employee o1, Employee o2) {
                                return o1.getName().compareToIgnoreCase(o2.getName());
                            }
                        });
                        for (Employee employee : employees) {
                            System.out.println(employee);
                        }
                    }
                    case 2 -> {
                        employees.sort(new Comparator<Employee>() {
                            @Override
                            public int compare(Employee o1, Employee o2) {
                                if (o1.getSalary() < o2.getSalary()) return -1;
                                else return 1;
                            }
                        });
                        for (Employee employee : employees) {
                            System.out.println(employee);
                        }
                    }
                } break;
            case 6:
            case 7: break;
            default:
                System.out.println("Lưa chọn không hợp lệ "); break;
        }
    }
}
