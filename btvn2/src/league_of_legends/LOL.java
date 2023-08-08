package league_of_legends;

import java.util.ArrayList;

public class LOL {
    private ArrayList<Team> teams;

    public LOL(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "LOL{" +
                "Teams: " + teams +
                '}';
    }
}
