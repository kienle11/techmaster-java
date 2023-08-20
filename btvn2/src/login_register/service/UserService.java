package login_register.service;

import login_register.entities.User;

import java.util.Map;
import java.util.Scanner;

public class UserService {
    public void register(Scanner scanner, Map<String, User> userMap) {
        do {
            System.out.println("Enter username");
            String userName = scanner.nextLine();
            if (userMap.containsKey(userName)) {
                System.out.println("Usernam exist. Try again");
                continue;
            }
            System.out.println("Enter email");
            String email = scanner.nextLine();
            for (User user : userMap.values()) {
                if (user.getEmail().equals(email)) System.out.println("Email exist. Try again");
            }
            System.out.println("Enter your password");
            String password = scanner.nextLine();
            User user = new User(email, password);
            userMap.put(userName, user);
            System.out.println("Register success");
            break;
        } while (true);
    }

    public void login(Scanner scanner, Map<String, User> userMap) {
        do {
            System.out.println("Enter username");
            String userName = scanner.nextLine();
            if (!userMap.containsKey(userName)) {
                System.out.println("Username doesn't exist. Try again");
                return;
            } else {
                User user = userMap.get(userName);
                System.out.println("Enter your password");
                String password = scanner.nextLine();
                if (!user.getPassword().equals(password)) {
                    System.out.println("1. Try again");
                    System.out.println("2. Forgot password");
                    try {
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1 -> {}
                            case 2 -> {
                            forgotPass(scanner, userMap, userName);}
                        }
                    } catch (Exception e) {
                      System.out.println("Can only choose number");}
               }else {
                    System.out.println("Login successful. Hello " + userName);
                    break;}
            }
        } while (true);}

    public void forgotPass(Scanner scanner, Map<String, User> userMap, String userName) {
        do {
            System.out.println("Enter your email");
            String email = scanner.nextLine();
            User user = userMap.get(userName);
            if (user.getEmail().equals(email)) {
                System.out.println("Enter your new password");
                String newPassword = scanner.nextLine();
                user.setPassword(newPassword);
                System.out.println("Change password success"); break;
            } else{
                System.out.println("Wrong email. Try again");}
        } while (true);
    }
}
