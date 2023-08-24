package phone;

import java.util.Map;
import java.util.Scanner;

public class PhoneStore {
    public void add(Scanner sc, Map<String,Phone>phoneMap){
        System.out.println("Enter brand");
        String brand = sc.nextLine();
        System.out.println("Phone's name");
        String phoneName = sc.nextLine();
        System.out.println("Enter price");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Quantity");
        int quantity = Integer.parseInt(sc.nextLine());
        Phone phone = new Phone(phoneName,brand,price,quantity);
        phoneMap.put(phone.getBrand(),phone);
        System.out.println("Add successful");
    }
    public void delete(Scanner scanner, Map<String,Phone>phoneMap){
        System.out.println("Enter brand");
        String brand = scanner.nextLine();
        if (!phoneMap.containsKey(brand)){
            System.out.println("Store doesn't have it");
        }
        else {
        System.out.println("Enter phone'name u want to delete");
        String phoneName = scanner.nextLine();
        Phone phone = phoneMap.get(brand);
        if (phoneName.equalsIgnoreCase(phone.getName()))
        {phoneMap.remove(phone.getName());}}
    }
public void findPhone(Scanner scanner,Map<String,Phone>phoneMap) {
   do {
    System.out.println("Find phone by:");
    System.out.println("1. By brand");
    System.out.println("2. By name");
    int choice = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter brand");
    String brand = scanner.nextLine();
       switch (choice) {
           case 1 -> {
               Phone phone1 = phoneMap.get(brand);
               if (phone1.getBrand().equalsIgnoreCase(brand))
                   System.out.println(phone1);
               else {
                   System.out.println("Store doesn't have that brand");
               }
           }
           case 2 -> {
               if (phoneMap.containsKey(brand)) {
                   System.out.println("Enter phone's name u want to find");
                   String name = scanner.nextLine();
                   Phone phone = phoneMap.get(brand);
                   if (phone.getName().equalsIgnoreCase(name)) System.out.println(phone);
                   else System.out.println("Cant find the phone you need");
               }
           }
       }
   } while (true);
}
}
