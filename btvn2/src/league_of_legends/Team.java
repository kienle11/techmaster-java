package league_of_legends;

import java.util.ArrayList;

public class Team {
    private ArrayList<Hero> heroes;
    private String name;

    public Team(ArrayList<Hero> heroes, String name) {
        this.heroes = heroes;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"\t"+ heroes ;
    }
}
