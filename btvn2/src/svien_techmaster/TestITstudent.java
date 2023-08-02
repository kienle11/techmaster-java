package svien_techmaster;

import java.util.Scanner;

public class TestITstudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên học sinh");
        String itName = scanner.nextLine();
        System.out.println("Nhập điểm java");
        double javaPoint = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm HTML");
        double htmlPoint = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm CSS");
        double cssPoint = Double.parseDouble(scanner.nextLine());
         do {
             if (javaPoint<0 || htmlPoint<0 || cssPoint<0){
            System.out.println("Điểm không thể là số âm. Mời nhập lần lượt lại các điểm Java, Html, Css");
            javaPoint = Double.parseDouble(scanner.nextLine());
            htmlPoint = Double.parseDouble(scanner.nextLine());
            cssPoint = Double.parseDouble(scanner.nextLine());}
             else if (javaPoint>10 || htmlPoint>10 || cssPoint>10) {
                 System.out.println("Điểm luôn nhỏ hơn 10. Mời nhập lần lượt lại các điểm Java, Html, Css");
                 javaPoint = Double.parseDouble(scanner.nextLine());
                 htmlPoint = Double.parseDouble(scanner.nextLine());
                 cssPoint = Double.parseDouble(scanner.nextLine());
             }
             else break;
         }while (javaPoint!=0 || htmlPoint!=0 || cssPoint!=0);
        ITstudent iT1 = new ITstudent(itName,javaPoint,htmlPoint,cssPoint);
        iT1.inforIT();
    }
}
