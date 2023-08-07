package btvn3;

import java.util.Scanner;

public class Bai2_YesNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter n:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Do you want to continue? (Y/N)");
        String answer = scanner.nextLine();
        do {
            if (answer.equals("y")) {
                    System.out.println("Enter n:");
                    n = Integer.parseInt(scanner.nextLine());
                    System.out.println("Do you want to continue? (Y/N)");
                    answer = scanner.nextLine();
                }
            else{
                for (int i = 0; i <= n; i++) {
                    sum += i;
                }
                System.out.println(sum);
                break;
            }}
            while (answer.equals("y") || answer.equals("n")) ;

}
}


