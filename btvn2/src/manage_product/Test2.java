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
    }
}
