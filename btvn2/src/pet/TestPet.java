package pet;

import pet.entities.Pet;
import pet.service.PetService;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        PetService service = new PetService();
        Pet pet = service.createPet(scanner); //Ng dùng nhập thông tin thú cưng
        do {
            service.match(pets,pet);
            System.out.println("Do you want to find another pet? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) break;
        }while (true);
    }
}
