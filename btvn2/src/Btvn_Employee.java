import java.util.Scanner;

public class Btvn_Employee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Your experience:");
        double exp = Double.parseDouble(scanner.nextLine());
        System.out.println("Your work place:");
        String workPlace = scanner.nextLine();
        Employee employee = new Employee(id, name, address, age, exp,workPlace);
        System.out.println(employee);
    }
}
