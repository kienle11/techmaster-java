package pet.service;

import pet.entities.Pet;
import pet.entities.Type;

import java.util.ArrayList;
import java.util.Scanner;

public class PetService {
    public Pet createPet(Scanner scanner){
        System.out.println("Enter your pet information");
        System.out.println("Pet's name");
        String name = scanner.nextLine();
        System.out.println("Pet's gender");
        String gender = scanner.nextLine();
        System.out.println("Pet description");
        String description = scanner.nextLine();
        System.out.println("Is a dog/cat");
        Type type = Type.valueOf(scanner.nextLine());
        int age =0;
        do { System.out.println("Pet's age");
            try {
            age = Integer.parseInt(scanner.nextLine());
            return new Pet(name,age,gender,type,description);
            }catch (Exception e){
            System.out.println("Invalid information. Try again");
            }
        } while (true);
    }
    public void match(ArrayList<Pet>pets,Pet pet){
        for (Pet pet1 : pets){
            if (pet.getType().equals(pet1.getType()))
                break;
            else if (pet.getGender().equals(pet1.getGender())) {
                break;
            }
            else System.out.println(pet1);
        }
    }
}
