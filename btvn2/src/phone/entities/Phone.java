package phone.entities;

public class Phone {
    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Phone(String name, String brand, double price, int quantity) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public Phone(String name, String brand, int quantity) {
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
