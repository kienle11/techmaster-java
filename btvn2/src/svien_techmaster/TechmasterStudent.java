package svien_techmaster;

public abstract class TechmasterStudent {
    protected String name;
    protected String major;


    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public TechmasterStudent() {

    }

    public abstract double getPoint();

    public TechmasterStudent(String name) {
        this.name = name;
    }

    public void information() {
        System.out.println(name+", Chuyên ngành: "+major+", Điểm "+getPoint());
        getRank();
    }

    public void getRank() {
        if (getPoint()< 5) {
            System.out.println("Học lực yếu");
        } else if (getPoint() >= 5 && getPoint() < 6.5) {
            System.out.println("Học lực trung bình ");
        } else if (getPoint()>=6.5 && getPoint()<7.5) {
            System.out.println("Học lực khá");
        }
        else System.out.println("Học lực giỏi");
    }

}