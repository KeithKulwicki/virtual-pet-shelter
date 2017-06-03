package virtualPetShelterProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		System.out.println(" ");
		System.out.println("Thank you for volunteering at SebMax, a NO KILL Virtual Animal Shelter!");
		boolean exit = false;
		do {
			System.out.println("");
			System.out.println("Pet Status: ");
			System.out.println("Name\t\t\t|\tHunger\t|\tThirst\t|\tBoredom\t|");

			for (VirtualPet currentPet : shelter.pets()) {
				System.out.println(currentPet.name + "\t\t|\t" + currentPet.hungerLevel + "\t|\t" + currentPet.thirstLevel
						+ "\t|\t\t" + currentPet.boredomLevel + "\t|");
			}
			// Asks for user input
			System.out.println("");
			System.out.println("What would you like to do next?");
			System.out.println("1. Feed the pets ");
			System.out.println("2. Water the pets ");
			System.out.println("3. Play with a pet ");
			System.out.println("4. Adopt a pet ");
			System.out.println("5. Admit a homeless pet ");
			System.out.println("6. Ignore pets ");
			System.out.println("7. Leave SebMax Virtual Pet Shelter");
			String response = input.next();
			input.nextLine();
			// Writes output to the console
			switch (response) {
			case "1": // Feed all of the pets in the shelter
				shelter.feedPets();
				System.out.println("");
				System.out.println("Thanks for feeding the pets.");
				break;
			case "2": // Water all of the pets in the shelter
				shelter.waterPets();
				System.out.println("");
				System.out.println("Thanks for watering the pets.");
				break;
			case "3": // plays (or performs some other interaction(s)) with an
						// individual pet in the shelter
				System.out.println("");
				System.out.println("Here's the list of available pets with which to play:");
				displayPets(shelter);
				System.out.println("");
				System.out.println("Enter pet name with which you would like to play?");
				String petName = input.next();
				shelter.playWithPets(shelter.getPet(petName));
				System.out.println("");
				System.out.println("Enjoy playing with " + petName + ". ");
				break;
			case "4": // Allow adoption of a pet in the shelter
				System.out.println("");
				System.out.println("Here's the list of pets available for adoption:");
				displayPets(shelter);
				System.out.println("");
				System.out.println("Enter pet name which you are giving a home?");
				String nameToAdopt = input.next();
				shelter.adopt(nameToAdopt);
				System.out.println("");
				System.out.println("Adopting a pet is AWESOME! Thak you! Enjoy your Forever Home, " + nameToAdopt
						+ ". We'll miss you!");
				break;
			case "5": // Allow intake of a homeless pet
				System.out.println("");
				System.out.println("There's pleanty of room. Enter the new pet's name: ");
				String name = input.nextLine();
				System.out.println("");
				System.out.println("Enter the new pet's descritpion:");
				String description = input.nextLine();
				VirtualPet x = new VirtualPet(name, description);
				shelter.intake(x);
				System.out.println("");
				System.out.println("Don't worry. We will take good care of " + x.getName());
				break;
			case "6": // Ignore pets
				System.out.println("");
				System.out.println("Are you looking for anything in particular?");
				break;
			case "7": // End
				System.out.println("");
				System.out.println("Thanks for visiting SebMax Virtual Pet Shelter. Ya'll come back now, Y'hear??");
				System.exit(0);
			default: // Invalid user input
				System.out.println("");
				System.out.println("*** Please enter a valid selection ***");
				break;
			}
			shelter.tick(); // calls VirtualPetShelter's tick method after each
							// interaction
		} while (!exit);
		input.close();

	}

	private static void displayPets(VirtualPetShelter y) {
		Collection<VirtualPet> listOfPets = new ArrayList<>();
		listOfPets = y.pets();
		for (VirtualPet currentPet : listOfPets) {
			System.out.println(currentPet);
		}

	}
}
