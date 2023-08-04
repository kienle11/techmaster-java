package svien_techmaster;

public class ITstudent extends TechmasterStudent{
    private double javaPoint;
    private double htmlPoint;
    private double cssPoint;

    public ITstudent(String name, double javaPoint, double htmlPoint, double cssPoint) {
        super(name);
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }

    public ITstudent(double javaPoint, double htmlPoint, double cssPoint) {
        super();
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
        this.cssPoint = cssPoint;
    }

    public void inforIT(){
        System.out.println(name+", java: "+javaPoint+", html: "+htmlPoint+", css: "+cssPoint);
        System.out.println("Điểm: "+getPoint());
        getRank();
    }

    @Override
    public double getPoint() {
        return (2*javaPoint+htmlPoint+cssPoint)/4;
    }

    @Override
    public void getRank() {
        super.getRank();
    }

    @Override
    public String toString() {
        return "ITstudent{" +
                "javaPoint=" + javaPoint +
                ", htmlPoint=" + htmlPoint +
                ", cssPoint=" + cssPoint +
                ", name='" + name + '\'' +
                '}';
    }
}


