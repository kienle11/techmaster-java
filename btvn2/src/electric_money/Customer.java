package electric_money;

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
        return "Customer{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", electricNumber=" + electricNumber +
                '}';
    }
}
