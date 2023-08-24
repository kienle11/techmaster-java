package phone.service;

import phone.entities.Customer;
import phone.entities.Phone;

import java.util.*;

public class SalesReport {
    public void createReceipt(Scanner scanner,Map<Integer,Customer>customers,Customer customer){
        System.out.println("Enter customer's phone number");
        int phoneNumber= Integer.parseInt(scanner.nextLine());
        for (Customer customer1: customers.values()){
        if (customer1.getPhoneNumber()==phoneNumber){
        System.out.println("Number of phones purchased");
        int n = Integer.parseInt(scanner.nextLine());
        List<Phone> purchasePhone= new ArrayList<>();
        double totalPay = 0;
        purchasePhone(purchasePhone,totalPay,scanner,n,customer);
            System.out.println(purchasePhone);
        }
    }}
    public void purchasePhone(List<Phone>purchasePhone,double totalPay,Scanner scanner, int n,Customer customer){
        for (int i=0; i<n;i++){
            System.out.println("Enter phone "+(i+1)+" information");
            System.out.println("Brand:");
            String brand = scanner.nextLine();
            System.out.println("Name:");
            String phoneName = scanner.nextLine();
            System.out.println("Purchase quantity:");
            int quantity = Integer.parseInt(scanner.nextLine());
            Phone phone=new Phone(phoneName,brand,quantity);
            purchasePhone.add(phone);
            if (quantity==1){
                totalPay +=phone.getPrice();
                customer.setTotalPay(totalPay);}
            else if (quantity>1) {
                totalPay+= (phone.getPrice()*quantity);
                customer.setTotalPay(totalPay);}
        }
    }

}
