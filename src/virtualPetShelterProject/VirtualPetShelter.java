package virtualPetShelterProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> mapVirtualPets = new HashMap<String, VirtualPet>();

	Collection<VirtualPet> pets() {
		return mapVirtualPets.values();
	}

	VirtualPet getPet(String name) {
		return mapVirtualPets.get(name);
	}

	void intake(VirtualPet pet) {
		mapVirtualPets.put(pet.name, pet);
	}

	void adopt(String name) {
		mapVirtualPets.remove(name);
	}

	void feedPets() {
		for (VirtualPet currentPet : mapVirtualPets.values()) {
			currentPet.feed();
		}
	}

	void waterPets() {
		for (VirtualPet currentPet : mapVirtualPets.values()) {
			currentPet.water();
		}
	}

	void playWithPets(VirtualPet p) {
		p.play();
	}

	void tick() {
		for (VirtualPet currentPet : mapVirtualPets.values()) {
			currentPet.tick();
		}
	}

	@Override
	public String toString() {
		return ("" + mapVirtualPets.keySet() + mapVirtualPets.values());
	}
}