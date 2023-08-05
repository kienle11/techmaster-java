package manage_product;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng hóa");
        int n = Integer.parseInt(scanner.nextLine());
        ManageProduct[] products = new ManageProduct[n];
        ManageProduct product = new ManageProduct();
        for (int i = 0; i < n; i++) {
            product.enterInput(scanner);
            products[i]= product;
            product = new ManageProduct();
        }
        System.out.println(Arrays.toString(products));
        product.findName(scanner,products); //Tìm theo tên sp
        product.findID(scanner,products); //Tìm theo id
        product.findAmountUnder5(products); // Tìm sp có số lượng <5
        product.setAmount(scanner,products); // Cập nhật số lượng sp
        product.findPrice(scanner,products); // Tìm sp trong tầm giá
        //Tim sp theo ten
       /* System.out.println("Tìm sp theo tên");
        String answer = scanner.nextLine();
        for (ManageProduct findName: products){
        if (answer.equals(findName.getName())) {
            System.out.println(findName);
        }
    }
        //Tim sp theo id
        System.out.println("Tìm sp theo id");
        int answer2 = Integer.parseInt(scanner.nextLine());
        for (ManageProduct id: products){
        if (answer2==id.getId()){
        System.out.println(id);
            }
        }
        //Tim sp co so luong <5
        System.out.println("Tìm các sp số lượng nhỏ hơn 5");
        for (ManageProduct amount: products){
        if (amount.getAmount()<5) {
            System.out.println(amount);
        }
        }
        //Thay doi so luong sp
        System.out.println("Bạn muốn thay đổi số lượng sp nào");
        String answer3 = scanner.nextLine();
        for (ManageProduct setAmout: products){
        if (answer3.equals(setAmout.getName())) {
            System.out.println("Nhập số lượng mới ");
        }
        double newAmount = Double.parseDouble(scanner.nextLine());
        setAmout.setAmount(newAmount);
        System.out.println(setAmout);
        break;}

        //Tim sp theo muc gia
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào? a.Dưới 50k, b.50k-100k, c.>100k");
        String answer1 = scanner.nextLine();
        for (ManageProduct price : products) {
            switch (answer1) {
                case "a" -> {
                    if (price.getPrice() < 50000) {
                        System.out.println(price);
                    }
                }
                case "b" -> {
                    if (price.getPrice() >= 50000 && price.getPrice() < 100000) {
                        System.out.println(price);
                    }
                }
                case "c" -> {
                    if (price.getPrice() > 100000) {
                        System.out.println(price);
                    }
                }
            }
        }*/
    }
}
