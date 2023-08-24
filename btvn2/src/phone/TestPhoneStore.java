package phone;

import phone.entities.Customer;
import phone.entities.Phone;
import phone.service.CustomerManager;
import phone.service.PhoneStore;
import phone.service.SalesReport;
import phone.view.Menu;

import java.util.*;

public class TestPhoneStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneStore store = new PhoneStore();
        List<Phone>purchasePhone = new ArrayList<>();
        Map<String, Phone>phones=new HashMap<>();
        CustomerManager customerManager = new CustomerManager();
        Map<Integer, Customer> customers=new HashMap<>();
        SalesReport report = new SalesReport();
        Customer customer = new Customer();
        Menu menu = new Menu();
        menu.menu();
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("Welcome manager!");
                System.out.println("1. Manage phone store");
                System.out.println("2. Manage customer");
                System.out.println("What do u want to do. Choose");
                int choose1 = Integer.parseInt(scanner.nextLine());
                switch (choose1) {
                    case 1 -> {
                        System.out.println("In this section you can do:");
                        System.out.println("1. Add new phones to the store");
                        System.out.println("2. Delete phone in the store ");
                        System.out.println("3. Find a phone by name or brand");
                        System.out.println("4. Store revenue"); //doanh thu cửa hàng
                        int choose2 = Integer.parseInt(scanner.nextLine());
                        switch (choose2) {
                            case 1 -> store.addPhone(scanner, phones);
                            case 2 -> store.delete(scanner, phones);
                            case 3 -> store.findPhone(scanner, phones);
                            case 4 -> System.out.println();
                            default -> System.out.println("Invalid choice. Try again!");
                        }
                    }
                    case 2 -> {
                        System.out.println("In this section you can do:");
                        System.out.println("1. Add new customer");
                        System.out.println("2. Delete customer");
                        System.out.println("3. Find customer by name or phone number");
                        int choose3 = Integer.parseInt(scanner.nextLine());
                        switch (choose3) {
                            case 1 -> customerManager.addCustomer(scanner, customers);
                            case 2 -> customerManager.deleteCustomer(scanner, customers);
                            case 3 -> customerManager.findCustomer(scanner, customers);
                            default -> System.out.println("Invalid choice. Try again!");
                        }
                    }
                    default -> System.out.println("Invalid choice. Try again!");
                }break;
            case 2:
                System.out.println("As a customer, you can: 1. Buy phones; 2. Return phones");
                System.out.println("What do you want to do");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("How many phone u want to buy");
                        int phoneAmount = Integer.parseInt(scanner.nextLine());
                        double totalPay=0;
                        report.purchasePhone(purchasePhone,totalPay,scanner,phoneAmount,customer);break;
                    case 2:
                        
                }
        }
    }
}
