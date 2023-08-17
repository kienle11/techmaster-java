package InTerFace.student;

import InTerFace.student.service.StudentImplement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap diem");
        double mark = Double.parseDouble(scanner.nextLine());
        StudentImplement implement = new StudentImplement();
        implement.display(name,age,mark);
        }
    }
