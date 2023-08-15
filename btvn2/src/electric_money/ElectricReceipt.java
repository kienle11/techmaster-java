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

    @Override
    public String toString() {
        return customer +"\n"+
                "Hóa đơn: "+"Chỉ số điện cũ: "+oldElectricNumber+", Chỉ số điện mới: "+newElectricNumber
                +". Thành tiền: "+ moneyPay+"VND";
    }
}
