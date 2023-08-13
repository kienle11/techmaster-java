package test;

import test.entities.Account;
import test.view.Menu;
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
        do {
        menu.menu();
        try {
        choose = Integer.parseInt(scanner.nextLine());
        } catch (Exception ignored) {}
        service.select(choose, scanner, accounts, menu);
        } while (true);
    }
}
