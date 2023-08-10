package league_of_legends.service;

import league_of_legends.entities.Hero;

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
