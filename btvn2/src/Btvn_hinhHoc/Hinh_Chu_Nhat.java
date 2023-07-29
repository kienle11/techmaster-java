package Btvn_hinhHoc;

public class Hinh_Chu_Nhat extends Congthuc {
    private double length;
    private double width;

    public Hinh_Chu_Nhat(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateS(){
        return getDienTich(length,width);
    }
    public double calculateP(){
        return getChuVi(length,width);
    }

    @Override
    public String toString() {
        return "Hinh Chu Nhat{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
