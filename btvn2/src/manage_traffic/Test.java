package manage_traffic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter road distance");
        double distance = Double.parseDouble(scanner.nextLine());
        while (distance<=0) {
           System.out.println("Invalid value. Please re-enter");
           distance = Double.parseDouble(scanner.nextLine());
       };
        Bus bus = new Bus(distance);
        bus.calculateTime();
        Train train = new Train(distance);
        AirPlane airPlane = new AirPlane(distance);
        System.out.println(train);
        System.out.println(bus);
        System.out.println(airPlane);
    }
}
