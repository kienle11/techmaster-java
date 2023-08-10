package worker.service;

import worker.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker createWorker(Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter workplace");
        String workPlace = scanner.nextLine();
        double salary = 0;
        do {
            System.out.println("Enter salary");
            try {
                salary = Double.parseDouble(scanner.nextLine());
                return new Worker(name, age, salary, workPlace);
            } catch (Exception e) {
                System.out.println("Invallid. Try again");
            }
        } while (true);
    }

    public void salaryUp(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Enter Id worker");
        String id = scanner.nextLine();
        System.out.println("Enter the salary you want to increase");
        double salaryUp = Double.parseDouble(scanner.nextLine());
        for (Worker pt : workers) {
            if (pt.getId().equalsIgnoreCase(id)) {
                pt.setSalary(pt.getSalary() + salaryUp);
                workers.add(pt);
            }
        }
    }
    public void salaryDown(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Enter Id worker");
        String id = scanner.nextLine();
        System.out.println("Enter the salary you want to decrease");
        double salaryDown = Double.parseDouble(scanner.nextLine());
        for (Worker pt : workers) {
            if (pt.getId().equalsIgnoreCase(id)) {
                pt.setSalary(pt.getSalary() - salaryDown);
                workers.add(pt);
            }
        }
    }
}