package Btvn_hinhHoc;

public class Congthuc {
    private double dienTich;
    private double chuVi;

    public double getDienTich(double length, double width){
        return length*width;
    }
    public double getChuVi(double length, double width){
        return (length+width)*2;
    }
    public double getDienTich(double side){
        return side*side;
    }
    public double getChuVi(double side){
        return side*4;
    }
}
