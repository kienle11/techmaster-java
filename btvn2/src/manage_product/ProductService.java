package manage_product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductService {
    public ManageProduct enterInput(Scanner scanner){
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Mô tả sản phẩm");
        String description = scanner.nextLine();
        System.out.println("Số lượng sản phẩm");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập đơn giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Đơn vị tính của sản phẩm");
        String unit = scanner.nextLine();
        return new ManageProduct(name,description,amount,price,unit);
    }
    public void getlistProduct(ManageProduct[] products){
        System.out.println(Arrays.toString(products));
    }
    public void findName(Scanner scanner, ManageProduct[] products){
        System.out.println("Bạn muốn tìm tên sản phẩm nào");
        String answer = scanner.nextLine();
        int count =0;
        for (ManageProduct p : products)
            if (answer.equals(p.getName())) {
                System.out.println(p);
            }
        if (count<=0) System.out.println("Khong co san pham ban can tim");
    }
    public void findID(Scanner scanner,ManageProduct[] products){
        System.out.println("Nhập id sản phẩm bạn muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (ManageProduct findID: products)
            if (id==findID.getId()) {
                System.out.println(findID);
                break;
            }
    }
    public void setAmount(Scanner scanner,ManageProduct[] products){
        System.out.println("Bạn muốn thay đổi số lượng sản phẩm nào");
        String answer3 = scanner.nextLine();
        for (ManageProduct amo: products){
            if (answer3.equals(amo.getName())) {
                System.out.println("Nhập số lượng mới ");
            double newAmount = Double.parseDouble(scanner.nextLine());
            amo.setAmount(newAmount);
            System.out.println(amo);
            break;}
    }}
    public void findAmountUnder5(ManageProduct[] products){
        System.out.println("Tìm các sản phẩm số lượng nhỏ hơn 5");
        for (ManageProduct findAmount: products){
            if (findAmount.getAmount()<5) {
            System.out.println(findAmount);
            break;}
        }
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
    public void menu (){
        System.out.println("Menu");
        System.out.println("Moi ban chon");
        System.out.println("1. Hien thi danh sach san pham");
        System.out.println("2. Tim san pham theo ten");
        System.out.println("3. Tim san pham theo id");
        System.out.println("4. Cap nhat so luong san pham");
        System.out.println("5. Tim san pham trong tam gia");
        System.out.println("6. Tim san pham co so luong duoi 5");
    }
}
