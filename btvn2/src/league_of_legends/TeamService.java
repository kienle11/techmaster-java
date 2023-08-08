package league_of_legends;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamService {
    public Team createTeam (Scanner scanner, LolService service, ArrayList<Hero> heroes){
        System.out.println("Ten doi");
        String name = scanner.nextLine();
            for (int i=0; i<5;i++){
                System.out.println("Thông tin tướng "+(i+1));
                Hero hero= service.createHero(scanner);
                heroes.add(hero);
            }
        return new Team(heroes,name);
        }
    }

