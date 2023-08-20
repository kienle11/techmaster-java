package login_register.view;

import login_register.entities.User;
import login_register.service.UserService;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("HELLO");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("Choose your destiny");
    }
    public void menuDoSelect(Scanner scanner, int choice, UserService service, Map<String, User> userMap){
        switch (choice) {
            case 1 -> service.login(scanner, userMap);
            case 2 -> service.register(scanner, userMap);
            case 3 -> { System.out.println("Exiting...");
                System.exit(0);}
            default -> System.out.println("Invalid choice. Try again");
        }
    }
}
