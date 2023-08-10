package worker.entities;

public class Worker {
    private static int autoId;
    private String id;
    private String name;
    private int age;
    private double salary;
    private String workPlace;

    public Worker(String name, int age, double salary, String workPlace) {
        this.id ="W" + ++autoId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
