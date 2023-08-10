package worker;

import worker.entities.Worker;

import java.time.LocalDate;

public class History {
    private Worker worker;
    private String status;
    private LocalDate updated;

    public History(Worker worker, String status) {
        this.worker = worker;
        this.status = status;
        this.updated = LocalDate.now();
    }

    @Override
    public String toString() {
        return "History{" +
                "worker=" + worker +
                ", status='" + status + '\'' +
                ", updated=" + updated +
                '}';
    }
}
