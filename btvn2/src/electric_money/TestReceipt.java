package electric_money;

import java.util.ArrayList;
import java.util.Scanner;

public class TestReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ho su dung dien");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i<n; i++){
            System.out.println("Nhap thong tin ho "+(i+1));
            System.out.println("Ten chu ho");
            String name = scanner.nextLine();
            System.out.println("So nha");
            int houseNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Ma so cong to dien");
            double electricNumber = Double.parseDouble(scanner.nextLine());
            Customer customer = new Customer(name, houseNumber,electricNumber);
            customers.add(customer);
        }

    }
}
