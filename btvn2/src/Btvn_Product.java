import java.util.Scanner;

public class Btvn_Product {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter product's ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product's name:");
        String name = scanner.nextLine();
        System.out.println("Enter product's price");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(name,id,price);
        double vat = product.calculateVat();
        System.out.println(product);
        System.out.println("VAT: "+vat);
    }
}
