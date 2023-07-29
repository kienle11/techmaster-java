package Btvn_hinhHoc;

import java.util.Scanner;

public class Btvn_hinhHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh hình vuông:");
        double side = Double.parseDouble(scanner.nextLine());
        while (side<0 || side==0){
            System.out.println("Thông số không hợp lệ. Mời nhập lại:");
            side = Double.parseDouble(scanner.nextLine());
        }
        Hinh_Vuong hinhVuong = new Hinh_Vuong(side);
        double dienTich = hinhVuong.calculateS(side);
        double chuVi = hinhVuong.calculateP(side);
        System.out.println(hinhVuong);
        System.out.println("Diện tích: "+dienTich+", Chu vi: "+chuVi);
        System.out.println("Nhập thông số hình chữ nhật:");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double length = Math.max(a,b); //Chiều dài
        double width = Math.min(a,b); // Chiều rộng
        //Các trường hợp xảy ra khi ng dùng nhập số liệu
        while (length!=0 && width!=0){
            if (length<0 || width<0){
                System.out.println("Thông số không hợp lệ. Mời nhập lại");
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                length = Math.max(a,b);
                width = Math.min(a,b);
            }
            else if (length==width) {
                System.out.println("Đây là hình vuông");
                Hinh_Vuong hinhVuong1 = new Hinh_Vuong(length);
                double dientich1 = hinhVuong.calculateS(length);
                double chuVi1 = hinhVuong.calculateP(width);
                System.out.println(hinhVuong1);
                System.out.println("Diện tích: "+dientich1+", Chu vi: "+chuVi1);
                break;
            }
            else {
                Hinh_chuNhat hinhChuNhat = new Hinh_chuNhat(length,width);
                double dienTich2 = hinhChuNhat.calculateS(length,width);
                double chuVi2 = hinhChuNhat.calculateP(length,width);
                System.out.println(hinhChuNhat);
                System.out.println("Diện tích: "+dienTich2+", Chu vi: "+chuVi2);
                break;
            }
        }
    }
}
