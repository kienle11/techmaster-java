package techmaster.entities;

public class Reader {
    private static int autoId;
    private int id;
    private String name;
    private int phoneNumber;
    private String address;

    public Reader(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = ++autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  id +
                ". " + name + '\t' +
                ", phoneNumber: " + phoneNumber +
                ", address: " + address;
    }
}
