package rongviet_company;

import rongviet_company.entities.Employee;
import rongviet_company.service.EmployeeServiceImpl;
import rongviet_company.service.ManaServiceImpl;
import rongviet_company.service.MktServiceImpl;
import rongviet_company.view.Menu;

import java.util.*;

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
        menu.menuSelect(choice,scanner,employees,employeeService,mktService,manaService);
    } while (choice!=7);
}}
