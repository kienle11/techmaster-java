package league_of_legends;

import java.util.ArrayList;
import java.util.Scanner;

public class LolService {
    public Hero createHero(Scanner scanner){
        System.out.println("Tên Tướng bạn muốn chọn");
        String name = scanner.nextLine();
        System.out.println("Vị trí bạn muốn chơi");
        String position = scanner.nextLine();
        return new Hero(name,position);
    }
    public void heroes(Scanner scanner, ArrayList<Hero> heroes, LolService service){
        for (int i=0; i<5;i++){
            System.out.println("Thông tin tướng "+(i+1));
            Hero hero= service.createHero(scanner);
            heroes.add(hero);
        }
    }
}
