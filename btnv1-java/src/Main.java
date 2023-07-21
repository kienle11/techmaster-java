// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap ten hang nhap kho:");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay thang nam sinh:");
        String dateBorn = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateBorn, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Nhap thoi gian nhap hang:");
        String timeNhaphang = scanner.nextLine();
        LocalDateTime timeNhap = LocalDateTime.parse(timeNhaphang, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Nhap thoi gian");
        String time = scanner.nextLine();
        LocalTime localDateTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Ten mat hang cua ban: "+name);
        System.out.println("Ngay thang nam sinh cua ban: "+date);
        System.out.println("Thoi gian hien tai: "+localDateTime);
        System.out.println("Thoi gian ban nhap hang: "+timeNhap);
    }
    }
