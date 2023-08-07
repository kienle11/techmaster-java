package manage_product;


import java.util.Scanner;

public class ManageProduct {
    private static int autoId=0;
    private int id;
    private String name;
    private String description;
    private double amount;
    private double price;
    private String unit;

    public ManageProduct(String name, String description, double amount, double price, String unit) {
        this.name = name;
        this.id= ++autoId;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return price;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  id + ". " + name + '\t' +"Số lượng: "+amount+
                ", Giá "+ price+" VND/"+unit+", Mô tả: "+description;
    }
}
