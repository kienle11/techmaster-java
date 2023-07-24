import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
        Phuong phap Do-While*/
                Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen n:");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        do {
            if (n%2==0){
                sum+=n;
            }
            n--;
        }
        while (n>0);

        System.out.println("Tong cac so: "+sum);
        }
    }
