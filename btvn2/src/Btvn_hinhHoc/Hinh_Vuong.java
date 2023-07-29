package Btvn_hinhHoc;

public class Hinh_Vuong extends Congthuc {
    private double side;

    public Hinh_Vuong(double side) {
        this.side = side;
    }
    public double calculateS(){
        return getDienTich(side);
    }
    public double calculateP(){
        return getChuVi(side);
    }

    @Override
    public String toString() {
        return "Hinh Vuong{" +
                "side=" + side +
                '}';
    }
}
