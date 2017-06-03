package virtualPetShelterProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> mapVirtualPets = new HashMap<String, VirtualPet>(); 
	

	public Collection<VirtualPet> pets(){
		return mapVirtualPets.values();
	}
	public VirtualPet getPet(String name){
		return mapVirtualPets.get(name);
	}
	public void intake(VirtualPet pet){
		mapVirtualPets.put(pet.name, pet);
	}

	public void adopt(String name){
		mapVirtualPets.remove(name);
	}
	public void feedPets(){
		for(VirtualPet currentPet: mapVirtualPets.values()){
			currentPet.feed();
		}
	}
	public void waterPets(){
		for(VirtualPet currentPet: mapVirtualPets.values()){
			currentPet.water();
		}
	}
	public void playWithPets(VirtualPet p){
		p.play();
	}
	public void tick() {
		for(VirtualPet currentPet: mapVirtualPets.values()){
			currentPet.tick();}
		}

	
	
	@Override
	public String toString() {
		return ("" + mapVirtualPets.keySet() + mapVirtualPets.values()); 
	}
}