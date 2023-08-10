package student.service;

import student.Student;

import java.util.Scanner;

public class StudentService {
    public Student createStudent(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        return new Student(name,address);
    }
    public Student createStudent2(Scanner scanner){
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter score Math");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter score Physics");
        double scorePhysics = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter score Chemistry");
        double scoreChemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name, scoreMath,scorePhysics,scoreChemistry);
    }

}

