package test;

import test.entities.Account;
import test.entities.Menu;
import test.service.OopService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestOop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        OopService service = new OopService();
        Menu menu = new Menu();
        int choose = 0;
        while (true) {
        menu.menu();
        try {
        choose = Integer.parseInt(scanner.nextLine());}
        catch (Exception e){
            System.out.printf("Mời bạn chọn lại. ");}
        switch (choose) {
        case 1 -> service.logIn(scanner, accounts,menu);
        case 2 -> service.register(scanner, accounts);
        default -> System.out.println("Lựa chọn không hợp lệ");}
        }
    }
}
