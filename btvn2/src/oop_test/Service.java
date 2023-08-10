package oop_test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {
public void password(Scanner scanner){
    while (true)
    {System.out.println("Enter password");
    String password = scanner.nextLine();
    String regex ="^[a-zA-Z0-9.,;_-]{7,15}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);
    if (matcher.find())break;
    else System.out.println("Incorrect. Try again");
    }
}

public void menu(){
    System.out.println("======== HELLO ========");
    System.out.println("1. Đăng nhập( nếu bạn đã có tài khoản)");
    System.out.println("2. Đăng ký( nếu bạn chưa có tài khoản)");
    System.out.println("Mời bạn chọn");
}
}



