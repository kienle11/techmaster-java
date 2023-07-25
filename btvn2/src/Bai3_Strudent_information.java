import java.util.Scanner;

public class Bai3_Strudent_information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Do you want to continue? (Y/N)");
        String answer = scanner.nextLine();
        do {
            if (answer.equals("y")){
                System.out.println("Enter your name:");
                name = scanner.nextLine();
                System.out.println("Enter your address:");
                address = scanner.nextLine();
                System.out.println("Enter your age:");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("Address: "+address);
                System.out.println("Do you want to continue? (Y/N)");
                answer= scanner.nextLine();
            }
            else {
                break;
            }
        }while (answer.equals("y") || answer.equals("n"));
    }
}
