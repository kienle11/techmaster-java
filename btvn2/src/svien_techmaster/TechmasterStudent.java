package svien_techmaster;

public abstract class TechmasterStudent {
    protected String name;
    protected String major;
    protected double point;

    public TechmasterStudent(String name, String major, double point) {
        this.name = name;
        this.major = major;
        this.point = point;
    }

    public abstract double getPoint();

    public TechmasterStudent(String name) {
        this.name = name;
    }

    public void information() {
        System.out.println(name+", Chuyên ngành: "+major+", Điểm "+point);
        getHocLuc();
    }

    public void getHocLuc() {
        if (point < 5) {
            System.out.println("Học lực yếu");
        } else if (point >= 5 && point < 6.5) {
            System.out.println("Học lực trung bình ");
        } else if (point >=6.5 && point<7.5) {
            System.out.println("Học lực khá");
        }
        else System.out.println("Học lực giỏi");
    }


    @Override
    public String toString() {
        return "SinhVienTechmaster{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", point=" + point + "}";
    }
}