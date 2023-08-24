package phone;

import java.util.List;
import java.util.Map;

public class Customer {
    private String name;
    private int phoneNumber;
    private List<Phone> purchasePhones;
    private double totalPay;

    public Customer(String name, int phoneNumber,List<Phone> purchasePhones, double totalPay) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.purchasePhones = purchasePhones;
        this.totalPay = totalPay;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
