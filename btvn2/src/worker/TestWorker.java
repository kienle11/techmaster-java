package worker;

import worker.entities.MenuWorker;
import worker.entities.Worker;
import worker.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class TestWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService service = new WorkerService();
        MenuWorker menuWorker = new MenuWorker();
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<History> histories = new ArrayList<>();
        do {
            menuWorker.menu();
            int choose = menuWorker.selectMenu(scanner);
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