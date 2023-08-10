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
        menuWorker.menu();
        int choose = menuWorker.selectMenu(scanner);
        do {
            switch (choose) {
                case 1:
                    Worker worker = service.createWorker(scanner);
                    workers.add(worker);
                    break;
                case 2:
                    service.salaryUp(scanner, workers);
                    break;
                case 3:
                    service.salaryDown(scanner, workers);
                    break;
                case 4:
            }
            System.out.println("Do you want to continue? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) break;
        } while (true);
    }
}