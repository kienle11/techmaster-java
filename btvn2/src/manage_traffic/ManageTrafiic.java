package manage_traffic;

public abstract class ManageTrafiic {
    private Bus bus;
    private Train train;
    private AirPlane airPlane;

    public Bus getBus() {
        return bus;
    }

    public Train getTrain() {
        return train;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public abstract double calculateTime();
}
