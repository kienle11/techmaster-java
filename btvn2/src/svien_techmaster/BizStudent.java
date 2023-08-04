package svien_techmaster;

public class BizStudent extends TechmasterStudent{
    private double marketingPoint;
    private double salesPoint;

    public BizStudent(String name, double marketingPoint, double salesPoint) {
        super(name);
        this.marketingPoint = marketingPoint;
        this.salesPoint = salesPoint;
    }

    public BizStudent(double marketingPoint, double salesPoint) {
        this.marketingPoint = marketingPoint;
        this.salesPoint = salesPoint;
    }

    @Override
    public double getPoint() {
        return (2*marketingPoint+salesPoint)/3;
    }
    public void inforBiz(){
        System.out.println(name+", Marketing: "+marketingPoint+", Sales: "+salesPoint);
        System.out.println("Điểm: "+getPoint());
        getRank();
    }

    @Override
    public void getRank() {
        super.getRank();
    }

    @Override
    public String toString() {
        return "BizStudent{" +
                "marketingPoint=" + marketingPoint +
                ", salesPoint=" + salesPoint +
                ", name='" + name + '\'' +
                '}';
    }
}
