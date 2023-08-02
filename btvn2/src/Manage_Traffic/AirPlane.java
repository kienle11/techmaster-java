package Manage_Traffic;

public class AirPlane extends ManageTrafiic{
    private double speed = 80;
    private double distance;

    public AirPlane(double distance) {
        this.distance = distance;
    }

    @Override
    public double calculateTime() {
        return distance/speed;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "speed:" + speed +
                "km/h, distance:" + distance +
                " km, Complete the road in: "+calculateTime()+"h}";
    }
}
