package tiktok;

import java.util.ArrayList;

public class Idol {
    private static int autoID =0;
    private int id;
    private String name;
    private String email;
    private ArrayList followers;
    private String group;

    public Idol(String name, ArrayList followers, String group, String email) {
        this.name = name;
        this.followers = followers;
        this.group = group;
        this.id = ++autoID;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + ", name: '" + name + '\'' +
                ", followers: " + followers +
                ", group: '" + group;
    }
}
