public class Employee extends Person{
   private double experience;
   private String workPlace;

    public Employee(int id, String name, String address, int age, double experience, String workPlace) {
        super(id, name, address, age);
        this.experience = experience;
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Employee{" + "id: "+getId() +
                ", name: "+getName() +
                ", age: "+getAge() +
                ", address: "+getAddress() +
                ", experience=" + experience +
                ", workPlace='" + workPlace + '\'' +
                '}';
    }
}
