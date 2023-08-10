package student;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private String address;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = ++autoId;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
        this.id = ++autoId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }
    public double avgPoint(){
        return (scoreMath+scoreChemistry+scorePhysic)/3;
    }
    public void getRank(double avgPoint){
        if (avgPoint>=8){
            System.out.println("Xep loai A");
        }
        else if (avgPoint<8 && avgPoint>=6.5) {
            System.out.println("Xep loai B");
        }
        else if (avgPoint<6.5) {
            System.out.println("Xep loai C");
        }
    }

  /*  @Override
    public String toString() {
        return id +
                ", Name:" + name + '\'' +
                ", Address: " + address;
    }*/
}
