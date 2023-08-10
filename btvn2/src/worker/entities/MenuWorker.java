package worker.entities;

import java.util.Scanner;

public class MenuWorker {
public void menu(){
    System.out.println("======== Worker Management ========");
    System.out.println("Add Worker");
    System.out.println("Up salary");
    System.out.println("Down salary");
    System.out.println("Display information salary");
}
public int selectMenu(Scanner scanner){
    do {
        System.out.println("Please choose");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Try again");
        }
    }while (true);
}
}
