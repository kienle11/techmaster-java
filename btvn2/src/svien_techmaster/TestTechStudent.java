package svien_techmaster;

import java.util.Scanner;

public class TestTechStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Ngành học");
        String major = scanner.nextLine();
        System.out.println("Điểm ");
        double point = Double.parseDouble(scanner.nextLine());
        while (point < 0 && point > 10) {
            System.out.println("Điểm luôn lớn hơn 0 và nhỏ hơn 10. Mời nhập lại ");
            point = Double.parseDouble(scanner.nextLine());
        }
        TechmasterStudent student1 = new TechmasterStudent(name,major,point) {
            @Override
            public double getPoint() {
                return 0;
            }
        };
        student1.information();
    }
}