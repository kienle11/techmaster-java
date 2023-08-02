package svien_techmaster;

import java.util.Scanner;

public class TestBizStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String bizName = scanner.nextLine();
        System.out.println("Nhập điểm Marketing ");
        double marketingPoint = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm Sales");
        double salesPoint = Double.parseDouble(scanner.nextLine());
        do {
            if (salesPoint<0 || marketingPoint <0){
            System.out.println("Điểm luôn là số dương. Mời nhập lại");
            System.out.println("Nhập điểm Marketing ");
            marketingPoint = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập điểm Sales");
            salesPoint = Double.parseDouble(scanner.nextLine());}
            else if (salesPoint>10 || marketingPoint>10) {
                System.out.println("Điểm luôn nhỏ hơn 10. Mời nhập lại");
                System.out.println("Nhập điểm Marketing ");
                marketingPoint = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập điểm Sales");
                salesPoint = Double.parseDouble(scanner.nextLine());}
            else break;
        }while (salesPoint!=0 || marketingPoint!=0);
        BizStudent biz1 = new BizStudent(bizName, marketingPoint,salesPoint);
        biz1.inforBiz();
    }
}
