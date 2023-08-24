package phone.service;

import phone.entities.Customer;
import phone.entities.Phone;

import java.util.*;

public class CustomerManager {
    public void add(Scanner scanner, Map<Integer, Customer>customers){
        System.out.println("Enter customer name");
        String customerName = scanner.nextLine();
        System.out.println("Enter phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Number of phones purchased");
        int n = Integer.parseInt(scanner.nextLine());
       List<Phone> purchasePhone= new ArrayList<>();
       double totalPay = 0;
       purchasePhone(purchasePhone,totalPay,scanner,n);
        Customer customer = new Customer(customerName,phoneNumber,purchasePhone);
        customers.put(customer.getPhoneNumber(),customer);
    }
    public void deleteCustomer(Scanner scanner, Map<Integer,Customer>customers){
        System.out.println("Enter customer's phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = customers.get(phoneNumber);
        if (customer.getPhoneNumber()==phoneNumber){
            customers.remove(customer);
            System.out.println("Delete successful");
        } else System.out.println("Cant find customer");
    }
    public void findCustomer(Scanner scanner, Map<Integer,Customer>customers){
        System.out.println("Find customer by:");
        System.out.println("1. Name");
        System.out.println("2. Phone number");
        System.out.println("Pls choose");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1 -> {
                System.out.println("Enter customer name");
                String name = scanner.nextLine();
                for (Customer customer : customers.values()) {
                    if (customer.getName().equalsIgnoreCase(name)) System.out.println(customer);
                    else System.out.println("Cant find customer " + name);
                }
            }
            case 2 -> {
                System.out.println("Enter customer phone number");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customers.values()) {
                    if (customer.getPhoneNumber() == phoneNumber) System.out.println(customer);
                    else System.out.println("Cant find customer");
                }
            }
            default -> System.out.println("Invalid choose. Choose again");
        }
    }
    public void purchasePhone(List<Phone>purchasePhone,double totalPay,Scanner scanner, int n){
        for (int i=0; i<n;i++){
            System.out.println("Enter phone "+(i+1)+" information");
            System.out.println("Brand:");
            String brand = scanner.nextLine();
            System.out.println("Phone name:");
            String phoneName = scanner.nextLine();
            System.out.println("Quantity:");
            int quantity = Integer.parseInt(scanner.nextLine());
            Phone phone=new Phone(phoneName,brand,quantity);
            purchasePhone.add(phone);
            totalPay +=phone.getPrice();}}
}
