package phone.service;

import phone.entities.Customer;
import phone.entities.Phone;

import java.util.*;

public class CustomerManager {
    public void addCustomer(Scanner scanner, Map<Integer, Customer>customers){
        System.out.println("Enter customer name");
        String customerName = scanner.nextLine();
        System.out.println("Enter phone number");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        Customer customer = new Customer(customerName,phoneNumber);
        customers.put(customer.getPhoneNumber(),customer);
        System.out.println("Add successful");
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

}
