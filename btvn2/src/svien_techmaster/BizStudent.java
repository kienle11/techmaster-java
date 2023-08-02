package svien_techmaster;

public class BizStudent extends TechmasterStudent{
    private double marketingPoint;
    private double salesPoint;

    public BizStudent(String name, double marketingPoint, double salesPoint) {
        super(name);
        this.marketingPoint = marketingPoint;
        this.salesPoint = salesPoint;
    }

    @Override
    public double getPoint() {
        return (2*marketingPoint+salesPoint)/3;
    }
    public void inforBiz(){
        System.out.println(name+", Marketing: "+marketingPoint+", Sales: "+salesPoint);
        System.out.println(getPoint());
        getHocLuc();
    }

    @Override
    public void getHocLuc() {
        if (getPoint() < 5) {
            System.out.println("Học lực yếu");
        } else if (getPoint()>= 5 && getPoint() < 6.5) {
            System.out.println("Học lực trung bình ");
        } else if (getPoint() >=6.5 && getPoint()<7.5) {
            System.out.println("Học lực khá");
        }
        else System.out.println("Học lực giỏi");
    }
}
