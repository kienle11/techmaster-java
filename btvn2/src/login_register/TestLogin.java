package login_register;

import login_register.entities.User;
import login_register.service.UserService;
import login_register.view.Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, User>userMap=new HashMap<>();
        UserService service = new UserService();
        Menu menu = new Menu();
        do {
        menu.menuDoSelect(scanner, service,userMap);
        }while (true);
    }}
