package pet.service;

import pet.entities.Pet;
import pet.entities.Type;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PetService {
    public Pet createPet(Scanner scanner) {
        System.out.println("Enter your pet information");
        System.out.println("Pet's name");
        String name = scanner.nextLine();
        System.out.println("Pet's gender");
        String gender = scanner.nextLine();
        System.out.println("Pet description");
        String description = scanner.nextLine();
        System.out.println("Is a dog/cat");
        Type type = Type.valueOf(scanner.nextLine());
        int age = 0;
        do {
            System.out.println("Pet's age");
            try {
                age = Integer.parseInt(scanner.nextLine());
                return new Pet(name, age, gender, type, description);
            } catch (Exception e) {
                System.out.println("Invalid information. Try again");
            }
        } while (true);
    }

    public void match(ArrayList<Pet> pets, Pet pet) {
        for (int i = 0; i < pets.size(); i++) {
            Random random = new Random();
            int n = random.nextInt(pets.size());
            Pet petDisplay = pets.get(n);
            if (petDisplay.getGender().equals(pet.getGender()) && petDisplay.getType()==pet.getType()) {
                break;
            }
            else if (petDisplay.getGender().equals(pet.getGender()) && petDisplay.getType()!=pet.getType()) {
                break;
            }
            else System.out.println(petDisplay);
        }
    }
}