import java.util.Scanner;

public class Btvn_hinhHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài cạnh hình vuông");
        double side = Integer.parseInt(scanner.nextLine());
        Hinh_Vuong hinhVuong = new Hinh_Vuong(side);
        double s = hinhVuong.calculateS();
        double p = hinhVuong.calculateP();
        System.out.println("Kích thước "+hinhVuong);
        System.out.println("Diện tích hình vuông: "+s);
        System.out.println("Chu vi hình vuông: "+p);
        System.out.println("Chiều dài hình chữ nhật");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Chiều rộng hình chữ nhật");
        int width = Integer.parseInt(scanner.nextLine());
        Hinh_Chu_Nhat hinhChuNhat = new Hinh_Chu_Nhat(length,width);
        double s1 = hinhChuNhat.calculateS();
        double p1 = hinhChuNhat.calculateP();
        System.out.println("Kích thước "+hinhChuNhat);
        System.out.println("Diện tích hình chữ nhật: "+s1);
        System.out.println("Chu vi hình chữ nhật: "+p1);

    }
}
