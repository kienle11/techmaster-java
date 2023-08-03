package manage_traffic;

public class AirPlane extends ManageTrafiic{
    public static final double speed = 80;

    @Override
    public double calculateTime(double distance) {
        return distance/speed;
    }
}
