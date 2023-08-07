package manage_product;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng hóa");
        int n = Integer.parseInt(scanner.nextLine());
        ManageProduct[] products = new ManageProduct[n];
        ProductService service = new ProductService();
        for (int i = 0; i < n; i++) {
          products[i]=service.enterInput(scanner);
        }
       MenuProduct menuProduct = new MenuProduct();
        MenuProduct.menu();
        do {
            String answer = scanner.nextLine();
            switch (answer) {
                case "1" -> service.getlistProduct(products);
                case "2" -> service.findName(scanner, products);
                case "3" -> service.findID(scanner, products);
                case "4" -> service.setAmount(scanner, products);
                case "5" -> service.findPrice(scanner, products);
                case "6" ->  service.findAmountUnder5(products);
            }
            System.out.println("Do you want to continue (Y/N)");
            if (answer.equalsIgnoreCase("n"))break;
            else if (answer.equalsIgnoreCase("y")) MenuProduct.menu();
         } while (true);
    }
}
