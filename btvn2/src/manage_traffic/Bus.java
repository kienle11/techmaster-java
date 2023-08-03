package manage_traffic;

public class Bus extends ManageTrafiic{
    public static final double speed = 20;


    @Override
    public double calculateTime(double distance) {
        return distance/speed;
    }
}
