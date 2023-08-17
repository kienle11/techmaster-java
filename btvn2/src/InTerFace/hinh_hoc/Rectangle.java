package InTerFace.hinh_hoc;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    @Override
    public void display() {
        System.out.println("Kich thuoc hinh chu nhat: "+length+"-"+width);
    }

    @Override
    public void calAre() {
        System.out.println("Dien tich hinh chu nhat: "+(length*width));
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
