package league_of_legends;

import league_of_legends.entities.Hero;
import league_of_legends.entities.LOL;
import league_of_legends.entities.Team;
import league_of_legends.service.LolService;
import league_of_legends.service.TeamService;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LolService service = new LolService();
        TeamService teamService = new TeamService();
        ArrayList<Hero> heroes1 = new ArrayList<>();
        System.out.println("Thong tin doi 1:");
        Team team1= teamService.createTeam(scanner,service,heroes1);
        System.out.println("Thong tin doi 2:");
        ArrayList<Hero> heroes2 = new ArrayList<>();
        Team team2 = teamService.createTeam(scanner,service,heroes2);
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        LOL lol = new LOL(teams);
        System.out.println(lol);
    }
}