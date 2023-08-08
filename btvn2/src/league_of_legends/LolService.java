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
}
