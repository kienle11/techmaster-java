package manage_product;

import java.util.Arrays;
import java.util.Scanner;

public class ManageProduct {
    private int id;
    private String name;
    private String description;
    private double amount;
    private double price;
    private String unit;
  

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

    public void enterInput(Scanner scanner){
        System.out.println("Nhập id");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        name = scanner.nextLine();
        System.out.println("Mô tả sản phẩm");
        description = scanner.nextLine();
        System.out.println("Số lượng sản phẩm");
        amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập đơn giá");
        price = Double.parseDouble(scanner.nextLine());
        System.out.println("Đơn vị tính của sản phẩm");
        unit = scanner.nextLine();
    }
    public void outPut(){
    System.out.println(id+". Tên sp: "+name+", Số lượng: "+amount+", Giá: "+price+"VND/"+unit+", Mô tả: "+description);
    }
    public void findName(Scanner scanner, ManageProduct[] products){
        System.out.println("Ban muon tim ten sp nao");
        String answer = scanner.nextLine();
        for (ManageProduct p : products)
        if (answer.equals(p.getName()))
            System.out.println(p);
   }
    public void findID(Scanner scanner,ManageProduct[] products){
        System.out.println("Ban muon tim id sp nao");
        int id = Integer.parseInt(scanner.nextLine());
        for (ManageProduct findID: products)
        if (id==findID.getId()) {
            System.out.println(findID);
        }
    }
    public void findAmountUnder5(ManageProduct[] products){
        System.out.println("Tìm các sp số lượng nhỏ hơn 5");
        for (ManageProduct findAmount: products){
        if (findAmount.getAmount()<5) {
        System.out.println(findAmount);}
        }
    }
    public void setAmount(Scanner scanner,ManageProduct[] products){
        System.out.println("Bạn muốn thay đổi số lượng sp nào");
        String answer3 = scanner.nextLine();
        for (ManageProduct amo: products){
            if (answer3.equals(amo.getName())) {
            System.out.println("Nhập số lượng mới ");
            }
            double newAmount = Double.parseDouble(scanner.nextLine());
            amo.setAmount(newAmount);
            System.out.println(amo);
            break;}
    }

    public void findPrice(Scanner scanner,ManageProduct[] products){
        //Tim sp theo muc gia
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào? a.Dưới 50k, b.50k-100k, c.>100k");
        String answer1 = scanner.nextLine();
        for (ManageProduct price : products) {
            switch (answer1) {
                case "a" -> {
                if (price.getPrice() < 50000) {
                System.out.println(price);}
                }
                case "b" -> {
                if (price.getPrice() >= 50000 && price.getPrice() < 100000) {
                System.out.println(price);}
                }
                case "c" -> {
                if (price.getPrice() > 100000) {
                System.out.println(price);}}
                }
                }
    }
    @Override
    public String toString() {
        return  id + ". " + name + '\t' +"Số lượng: "+amount+
                ", Giá "+ price+" VND/"+unit+", Mô tả: "+description;
    }
}
