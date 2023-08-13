package test.service;

import test.entities.Account;
import test.view.Menu;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopService {
    public Account findAccountByName(String name, List<Account> accounts) {
        for (Account account : accounts) {
        if (name.equals(account.getUserName())) {
        return account;}}
        return null;}

    public Account findAccountByEmail(String email, List<Account> accounts) {
        for (Account account : accounts) {
        if (email.equals(account.getEmail())) {
        return account;}}
        return null;}

    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return !matcher.matches();}

    public boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[,._;-])[a-zA-Z0-9,._;-]{7,15}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        return !matcher.matches();}

    public Account register(Scanner scanner, List<Account> accounts) {
            do {
                System.out.println("Đặt username");
                String userName = scanner.nextLine();
                if (findAccountByName(userName, accounts) != null) {
                System.out.println("Đã tồn tại username. Mời bạn nhập lại"); continue;}
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                if (findAccountByEmail(email, accounts) != null) {
                System.out.println("Email đã có người sử dụng"); continue;}
                else if (isValidEmail(email)) {
                System.out.println("Email không hợp lệ");continue;}
                System.out.println("Nhập mật khẩu(mật khẩu yêu cầu phải có 1 chữ cái in hoa và 1 ký tự)");
                String passwordNew = scanner.nextLine();
                if (isValidPassword(passwordNew)) {
                System.out.println("Mật khẩu nhập không đúng định dạng. Mời nhập lại");
                } else {
                System.out.println("Đăng ký thành công");
                return new Account(userName, passwordNew, email);}
            }while (true);
    }

    public void logIn(Scanner scanner, List<Account>accounts, Menu menu){
        System.out.println("Nhập username");
        String name = scanner.nextLine();
        Account account = findAccountByName(name, accounts);
        if (account == null) {
        System.out.println("Kiểm tra lại username");
        return;}
        System.out.println("Nhập mật khẩu");
        String password = scanner.nextLine();
        if (!password.equals(account.getPassword())) {
            System.out.println("Sai mật khẩu");
            System.out.println("1. Đăng nhập lại");
            System.out.println("2. Quên mật khẩu");
            int choose1 = 0;
            try {
            choose1 = Integer.parseInt(scanner.nextLine());}
            catch (Exception ignored){}
            switch (choose1) {
            case 1 -> {}
            case 2 -> forgotPassword(scanner, accounts);
            default -> System.out.println("Lựa chọn không hợp lệ");}
        } else {
            System.out.println("Chào mừng " + name + ", bạn có thể thực hiện các công việc sau:");
            int choice =0;
            do {
            menu.menuLogIn();
            try {
            choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception ignored) {}
            switch (choice) {
            case 1 -> changeName(scanner, accounts, account);
            case 2 -> changeEmail(scanner, accounts, account);
            case 3 -> changePassword(scanner, account);
            case 4 -> {}
            case 5 -> {
            System.out.println("Exiting...");
            scanner.close();
            System.exit(0);}
            default -> System.out.print("Lựa chọn không hợp lệ");}
            } while (choice != 4);
        }
    }
    public void changeName(Scanner scanner, List<Account>accounts, Account account){
    do {
        System.out.println("Mời bạn nhập tên mới");
        String newName = scanner.nextLine();
        if (findAccountByName(newName, accounts) != null) {
        System.out.println("Tên này đã được dùng.");}
        else {
        account.setUserName(newName);
        System.out.println("Thay đổi tên thành công.");
        break;}
    }while (true);}
    public void changeEmail(Scanner scanner, List<Account>accounts, Account account){
        do {
        System.out.println("Mời bạn nhập email mới");
        String newEmail = scanner.nextLine();
        if (isValidEmail(newEmail)) {
        System.out.println("Email không hợp lệ. Mời nhập lại "); continue;
        } else if (findAccountByEmail(newEmail, accounts) != null) {
        System.out.println("Email đã được sử dụng. Mời nhập email khác"); continue;
        } else {
        account.setEmail(newEmail);
        System.out.println("Thay đổi email thành công.");}break;
        }while (true);
    }
    public void changePassword(Scanner scanner, Account account){
        do {
        System.out.println("Mời bạn nhập mật khẩu mới");
        String newPassWord = scanner.nextLine();
        if (isValidPassword(newPassWord)) {
        System.out.println("Mật khẩu không hợp lệ. Mời nhập lại ");}
        else{
        account.setPassword(newPassWord);
        System.out.println("Thay đổi mật khẩu thành công.");break;}
    }while (true);}
    public void forgotPassword(Scanner scanner, List<Account>accounts){
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        Account account1 = findAccountByEmail(email, accounts);
        if (account1 == null) {
        System.out.println("Tài khoản ko tồn tại");
        } else {
        System.out.println("Mời nhập mật khẩu mới");
        String newPass = scanner.nextLine();
        account1.setPassword(newPass);
        System.out.println("Thay đổi mật khẩu thành công");
        }
    }
    public void select(int choose, Scanner scanner,List<Account>accounts, Menu menu){
        switch (choose) {
        case 1 -> logIn(scanner, accounts,menu);
        case 2 -> { Account account =register(scanner,accounts);
        accounts.add(account);}
        default -> System.out.println("Lựa chọn không hợp lệ");}
    }
}


