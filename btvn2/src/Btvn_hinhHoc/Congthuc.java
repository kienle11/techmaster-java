package Btvn_hinhHoc;

public class Congthuc {
    public double calculateS(double side){
        return side*side;
    }
    public double calculateP(double side){
        return side*4;
    }
    public double calculateS(double length, double width){
        return length*width;
    }
    public double calculateP(double length, double width){
        return (length+width)*2;
    }
}
