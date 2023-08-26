package Lab6;

public class Person {
    private static int autoID;
    protected int id;
    protected String name;
    protected int phone;
    protected String email;
    protected String address;

    public Person(String name, int phone, String email, String address) {
        this.id = ++autoID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
