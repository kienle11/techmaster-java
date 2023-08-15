package electric_money;

import electric_money.entities.Customer;
import electric_money.service.ElectricService;

import java.util.ArrayList;
import java.util.Scanner;

public class TestReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectricService service = new ElectricService();
        ArrayList<Customer> customers = new ArrayList<>();
           do {
               System.out.println("Nhập số hộ sử dụng điện");
               try {
               int n = Integer.parseInt(scanner.nextLine());
               service.enterInput(n, scanner, customers);break;
               } catch (Exception e) {
               System.out.println("Chỉ nhận dữ liệu dạng số");}
           }while (true);
    }
}
