package svien_techmaster;
import java.util.Arrays;
import java.util.Scanner;

public class InforStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh");
        int n = Integer.parseInt(scanner.nextLine());
        TechmasterStudent[] students = new TechmasterStudent[n];
        int count = 0;
        do {
            System.out.println("Nhap ten");
            String name = scanner.nextLine();
            System.out.println("Ban moon nhap thong tin svient IT hay svien Biz? (I/B)");
            String answer = scanner.nextLine();
            Service service = new Service();
            switch (answer) {
                case "i" -> {
           students[count] = service.itStudent(scanner, name);
                }
                case "b" -> {
                    students[count] = service.bizStudent(scanner, name);
                }
            }
            count ++;
        } while (count<n);
        System.out.println(Arrays.toString(students));
    }
}