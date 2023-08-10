package worker.entities;

import worker.History;
import worker.service.WorkerService;

import java.util.ArrayList;
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
public void handleMenu(Scanner scanner, WorkerService service, ArrayList<Worker>workers, ArrayList<History>histories){
    do {
        menu();
        int choose = selectMenu(scanner);
        switch (choose) {
            case 1 -> {
                Worker worker = service.createWorker(scanner);
                workers.add(worker);
            }
            case 2 -> service.salaryUp(scanner, workers, histories);
            case 3 -> service.salaryDown(scanner, workers, histories);
            case 4 -> System.out.println(histories);
        }
        System.out.println("Do you want to continue? (Y/N)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("n")) break;
    } while (true);
}
}
