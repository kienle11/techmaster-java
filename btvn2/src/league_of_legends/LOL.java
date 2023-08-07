package league_of_legends;

import java.util.ArrayList;

public class LOL {
    private Team teamA;
    private Team teamB;

    public LOL(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public String toString() {
        return "LOL:" +
                " teamA: " + teamA +
                ", teamB: " + teamB;
    }
}
