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
        Bus bus = new Bus();
        double time= bus.calculateTime(distance);
        System.out.println("Bus: Complete the road in "+time+"h");
        Train train = new Train();
        double timeTrain = train.calculateTime(distance);
        System.out.println("Train: Complete the road in "+timeTrain+"h");
        AirPlane airPlane = new AirPlane();
        double timePlane = airPlane.calculateTime(distance);
        System.out.println("Airplane: Complete the road in "+timePlane+"h");

    }
}
