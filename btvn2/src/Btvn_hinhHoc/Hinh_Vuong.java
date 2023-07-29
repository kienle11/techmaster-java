package Btvn_hinhHoc;

public class Hinh_Vuong extends Congthuc {
    private double side;

    public Hinh_Vuong(double side) {
        this.side = side;
    }

    @Override
    public double calculateS(double side) {
        return super.calculateS(side);
    }

    @Override
    public String toString() {
        return "Hinh_Vuong{" +
                "side=" + side +
                '}';
    }
}
