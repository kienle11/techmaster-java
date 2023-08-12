package electric_money;

import java.util.ArrayList;

public class ElectricReceipt {
    private Customer customer;
    private double oldElectricNumber;
    private double newElectricNumber;
    private double moneyPay;

    public ElectricReceipt(Customer customer, double oldElectricNumber, double newElectricNumber, double moneyPay) {
        this.customer = customer;
        this.oldElectricNumber = oldElectricNumber;
        this.newElectricNumber = newElectricNumber;
        this.moneyPay = moneyPay;
    }

    public double getMoneyPay(double oldElectricNumber, double newElectricNumber){
        return (this.newElectricNumber-this.oldElectricNumber)*750;
    }
}
