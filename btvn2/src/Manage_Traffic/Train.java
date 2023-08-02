package Manage_Traffic;

public class Train extends ManageTrafiic{
    private double speed = 40;
    private double distance;

    public Train(double distance) {
        this.distance=distance;
    }

    @Override
    public double calculateTime() {
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed:" + speed +
                "km/h, distance:" + distance +
                "km, Complete the road in: "+calculateTime()+
                " h}";
    }
}
