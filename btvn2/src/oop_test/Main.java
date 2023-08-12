package oop_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class User {
    String username;
    String email;
    String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}

public class Main {
    private static List<User> users = new ArrayList<>();
    private static User currentUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Đăng nhập");
            System.out.println("2 - Đăng ký");
            System.out.println("0 - Thoát chương trình");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        User user = findUserByUsername(username);

        if (user == null) {
            System.out.println("Kiểm tra lại username.");
            return;
        }

        if (!user.password.equals(password)) {
            System.out.println("Sai password.");
            System.out.println("1 - Đăng nhập lại");
            System.out.println("2 - Quên mật khẩu");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    forgotPassword();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } else {
            currentUser = user;
            System.out.println("Chào mừng " + currentUser.username + ", bạn có thể thực hiện các công việc sau:");
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    changeUsername();
                    break;
                case 2:
                    changeEmail();
                    break;
                case 3:
                    changePassword();
                    break;
                case 4:
                    currentUser = null;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void forgotPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        User user = findUserByEmail(email);

        if (user == null) {
            System.out.println("Email không tồn tại.");
        } else {
            System.out.print("Nhập mật khẩu mới: ");
            String newPassword = scanner.nextLine();
            user.password = newPassword;
            System.out.println("Mật khẩu đã được thay đổi.");
            currentUser = user;
        }
    }

    private static void changeUsername() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập username mới: ");
        String newUsername = scanner.nextLine();

        if (findUserByUsername(newUsername) != null) {
            System.out.println("Username đã tồn tại.");
        } else {
            currentUser.username = newUsername;
            System.out.println("Username đã được thay đổi.");
        }
    }

    private static void changeEmail() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập email mới: ");
        String newEmail = scanner.nextLine();

        if (!isValidEmail(newEmail)) {
            System.out.println("Email không hợp lệ.");
        } else if (findUserByEmail(newEmail) != null) {
            System.out.println("Email đã tồn tại.");
        } else {
            currentUser.email = newEmail;
            System.out.println("Email đã được thay đổi.");
        }
    }

    private static void changePassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();

        if (!isValidPassword(newPassword)) {
            System.out.println("Mật khẩu không hợp lệ.");
        } else {
            currentUser.password = newPassword;
            System.out.println("Mật khẩu đã được thay đổi.");
        }
    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập username: ");
        String username = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        if (findUserByUsername(username) != null) {
            System.out.println("Username đã tồn tại.");
        } else if (!isValidEmail(email)) {
            System.out.println("Email không hợp lệ.");
        } else if (findUserByEmail(email) != null) {
            System.out.println("Email đã tồn tại.");
        } else if (!isValidPassword(password)) {
            System.out.println("Mật khẩu không hợp lệ.");
        } else {
            users.add(new User(username, email, password));
            System.out.println("Đăng ký thành công.");
        }
    }

    private static User findUserByUsername(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static User findUserByEmail(String email) {
        for (User user : users) {
            if (user.email.equals(email)) {
                return user;
            }
        }
        return null;
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@{1}+.[a-zA-Z]mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 7 && password.length() <= 15 && containsUpperCase(password) && containsSpecialCharacter(password);
    }

    private static boolean containsUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String str) {
        String specialCharacters = ".-_,;";
        for (char c : str.toCharArray()) {
            if (specialCharacters.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
