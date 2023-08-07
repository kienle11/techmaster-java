package league_of_legends;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Team 1 name:");
        String name1 = scanner.nextLine();
        ArrayList<Hero> heroes1 = new ArrayList<>();
        LolService service = new LolService();
        service.heroes(scanner,heroes1,service);
        Team teamA = new Team(heroes1,name1 );
        
        System.out.println("Team 2 name:");
        String name2 = scanner.nextLine();
        ArrayList<Hero> heroes2 = new ArrayList<>();
        service.heroes(scanner,heroes2,service);
        Team teamB = new Team(heroes2,name2);
        LOL lol = new LOL(teamA, teamB);
        System.out.println(lol);
    }

}
