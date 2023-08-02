package Manage_Traffic;

public class Bus extends ManageTrafiic{
    private double speed = 20;
    private double distance;

    public Bus(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public double calculateTime() {
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "speed:" + speed +
                "km/h, distance:" + distance +
                "km, "+ "Complete the road in: "+calculateTime()+" h}";
    }
}
