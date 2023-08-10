package student;

import student.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        ArrayList<Student> students = new ArrayList<>();
        /*System.out.println(students);
        do { Student student = service.createStudent(scanner);
            students.add(student);
            System.out.println("Do u want to continue");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println(students);
                break;
            }
        }while (true);*/

        do { Student student = service.createStudent2(scanner);
            students.add(student);
            System.out.println(students);
            for (Student pt: students){
            double avgPoint = student.avgPoint();
            pt.getRank(avgPoint);
            System.out.println(pt);
            }
            System.out.println("Do u want to continue");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println(students);
                break;
            }
        }while (true);
    }
}
