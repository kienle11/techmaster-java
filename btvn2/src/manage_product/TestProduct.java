package manage_product;

import java.util.ArrayList;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng hóa");
        int n = Integer.parseInt(scanner.nextLine());
        ManageProduct[] products = new ManageProduct[n];
        ArrayList<ManageProduct> list = new ArrayList<>(n);
        for (int i = 0; i<n; i++){
            ManageProduct product = new ManageProduct();
            product.enterInput(scanner);
            list.add(product);
        }
        System.out.println(list);
        System.out.println("Tìm sp theo tên");
        String answer = scanner.nextLine();
        for (ManageProduct p: list){
            if (answer.equals(p.getName())){
                System.out.println(p);
            }
        }
        System.out.println("Tìm sp theo id");
        int answer2 = Integer.parseInt(scanner.nextLine());
        for (ManageProduct p:list){
            if (answer2==p.getId()){
                System.out.println(p);
            }

        }
    }
}
