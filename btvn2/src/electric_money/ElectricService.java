package electric_money;

import java.util.List;
import java.util.Scanner;

public class ElectricService {
    public double getMoneyPay(double oldElectricNumber, double newElectricNumber) {
        return (newElectricNumber - oldElectricNumber) * 750;}

    public Customer createCustomer(Scanner scanner) {
            System.out.println("Tên chủ hộ ");
            String name = scanner.nextLine();
            System.out.println("Số nhà");
            int houseNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Mã số công tơ điện");
            int electricID = Integer.parseInt(scanner.nextLine());
            return new Customer(name, houseNumber, electricID);}

        public void displayReceipt(ElectricReceipt receipt){
        System.out.println(receipt);}

        public ElectricReceipt receipt(Scanner scanner, Customer customer){
            System.out.println("Nhập số điện cũ");
            double oldElectricNumber = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập số điện mới");
            double newElectricNumber = Double.parseDouble(scanner.nextLine());
        if (oldElectricNumber>newElectricNumber){
            System.out.println("Thông số không hợp lệ. Số điện cũ phải nhỏ hơn số mới");
            return receipt(scanner,customer);}
            double moneypay = getMoneyPay(oldElectricNumber,newElectricNumber);
            return new ElectricReceipt(customer, oldElectricNumber,newElectricNumber,moneypay);}

    public void inFor(int n, Scanner scanner, List<Customer> customers){
        for (int i = 0; i<n; i++){
            System.out.println("Nhập thông tin khách hàng "+(i+1));
            Customer customer= createCustomer(scanner);
            customers.add(customer);
            ElectricReceipt receipt=receipt(scanner,customer);
            displayReceipt(receipt);}
    }
    }