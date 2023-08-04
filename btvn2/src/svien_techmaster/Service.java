package svien_techmaster;

import java.util.Scanner;

public class Service {
    public ITstudent itStudent(Scanner scanner, String name){
        System.out.println("Nhap diem java");
        double java = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem Html");
        double html = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem Css");
        double css = Double.parseDouble(scanner.nextLine());
        ITstudent studentIT = new ITstudent(name,java, html, css);
        return studentIT; }
    public BizStudent bizStudent (Scanner scanner, String name){
        System.out.println("Nhap diem Marketing");
        double marketing = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem Sales");
        double sales = Double.parseDouble(scanner.nextLine());
        BizStudent bizStudent = new BizStudent(name, marketing, sales);
        return bizStudent;
    }
}
