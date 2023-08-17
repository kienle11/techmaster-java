package InTerFace.student.service;

import InTerFace.student.service.Iclassification;

public class StudentImplement implements Iclassification {
    @Override
    public void display(String name, int age, double mark) {
        System.out.println(name+", Age: "+age+", Mark: "+mark);
        classify(mark);
    }

    @Override
    public void classify(double mark) {
        if (mark>=8){
            System.out.println("Rank A");
        } else if (mark<8 && mark>6.5) {
            System.out.println("Rank B");
        } else System.out.println("Rank C");
    }
}
