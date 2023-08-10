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
       menuWorker.handleMenu(scanner,service,workers,histories);
    }
}