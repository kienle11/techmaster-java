package Svien_Techmaster;

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

    public void inforIT(){
        System.out.println(name+", java: "+javaPoint+", html: "+htmlPoint+", css: "+cssPoint);
        System.out.println(getPoint());
        getHocLuc();
    }

    @Override
    public double getPoint() {
        return (2*javaPoint+htmlPoint+cssPoint)/4;
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


