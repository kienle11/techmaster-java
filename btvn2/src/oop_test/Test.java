package oop_test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        Service service = new Service();
        System.out.println("======== HELLO ========");
        System.out.println("1. Đăng nhập( nếu bạn đã có tài khoản)");
        System.out.println("2. Đăng ký( nếu bạn chưa có tài khoản)");
        System.out.println("Mời bạn chọn");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                   while (true) {
                       System.out.println("Enter username");
                       String userName = scanner.nextLine();
                       for (Account name : accounts) {
                           if (userName.equals(name.getUserName())) {
                               break;
                           } else System.out.println("User name incorrect. Try again");
                       } break;
                   }
                System.out.println("Enter password");
                   String password = scanner.nextLine();
                   for(Account pass: accounts) {
                       if (password.equals(pass.getPassword())) break;
                       else {
                           System.out.println("Incorrect password. Try again");
                           System.out.println("Get your password");
                           System.out.println("Enter your email");
                           String email = scanner.nextLine();
                           if (email.equals(pass.getEmail())){
                               System.out.println("Enter your new password");
                                String newPass = scanner.nextLine();}
                           else System.out.println("Account never exist");
                           return;
                       }
                   }

        }
    }
}