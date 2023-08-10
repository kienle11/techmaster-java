package league_of_legends.entities;

public class Hero {
    private String name;
    private String positon;
    private static int autoID;
    private int id;

    public Hero(String name, String positon) {
        this.name = name;
        this.positon = positon;
        this.id = ++autoID;
    }

    @Override
    public String toString() {
        return id +". "+name+", Position: "+positon;
    }
}
