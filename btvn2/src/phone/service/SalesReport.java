package phone.service;

import phone.entities.Customer;
import phone.entities.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SalesReport {
    private Map<Customer,Double> saleData;
    public void createReceipt(Scanner scanner, CustomerManager customerManager,Map<Integer,Customer>customers,Customer customer){
        System.out.println("Enter customer's phone number");
        int phoneNumber= Integer.parseInt(scanner.nextLine());
        for (Customer customer1: customers.values()){
        if (customer1.getPhoneNumber()==phoneNumber){
        System.out.println("Number of phones purchased");
        int n = Integer.parseInt(scanner.nextLine());
        List<Phone> purchasePhone= new ArrayList<>();
        double totalPay = 0;
        customerManager.purchasePhone(purchasePhone,totalPay,scanner,n,customer);
        }
    }}
}
