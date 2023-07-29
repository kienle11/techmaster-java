package Btvn_hinhHoc;

public class Hinh_chuNhat extends Congthuc {
    private double length;
    private double width;

    public Hinh_chuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateS(double length, double width) {
        return super.calculateS(length, width);
    }

    @Override
    public double calculateP(double length, double width) {
        return super.calculateP(length, width);
    }

    @Override
    public String toString() {
        return "Hinh_chuNhat{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
