package manage_traffic;

public class Train extends ManageTrafiic{
    public static final double speed = 40;


    @Override
    public double calculateTime(double distance) {
        return distance/speed;
    }

    @Override
    public void printInfor(double distance) {

    }
}
