package btvn3;

public class Product {
    private int id;
    private String name;

    private double price;


    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public double calculateVat(){
        return price*0.1;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
