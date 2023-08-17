package InTerFace.hinh_hoc;

public class Square implements Polygon{
private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        System.out.println("Kich thuoc hinh vuong: "+side+"cm");
    }

    @Override
    public void calAre() {
        System.out.println("Dien tich hinh vuong: "+side*side);
    }

}
