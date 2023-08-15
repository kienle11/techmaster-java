package electric_money.entities;

public class Customer {
    private String name;
    private int houseNumber;
    private double electricNumber;

    public Customer(String name, int houseNumber, double electricNumber) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.electricNumber = electricNumber;
    }

    @Override
    public String toString() {
        return "Khách hàng: " + name +
                ", Số nhà: " + houseNumber +
                ", Số công tơ điện: " + electricNumber;
    }
}
