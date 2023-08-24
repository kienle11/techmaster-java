package phone.entities;

import java.util.List;

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

    public Customer() {
    }

    public Customer(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{ " + name +
                ", phoneNumber: " + phoneNumber +
                ", purchasePhones: " + purchasePhones +
                ", totalPay: " + totalPay +
                '}';
    }
}
