import java.util.Random;

public class VirtualPet {
	// attributes
	int hungerLevel = 5;
	int thirstLevel = 5;
	int boredLevel = 10;
	int sleepyLevel = 10;

	Random generator = new Random();

	int getHunger() {
		return hungerLevel;
	}

	int feed() {
		return hungerLevel = 0;
	}// if eat, hunger = 0

	int getThirst() {
		return thirstLevel;
	}

	int water() {
		return thirstLevel = 0;
	}// if drink, thirst = 0

	int getBored() {
		return boredLevel;
	}

	int play() {
		hungerLevel += 5;// play = more hungry
		thirstLevel += 5;// play = more thirsty
		sleepyLevel += 5;// play = more sleepy
		return boredLevel = 0; // if play, bored = 0
	}

	int getSleepy() {
		hungerLevel += 5;// because you wake up hungry, sleepy = more hungry
		thirstLevel += 5;// because you wake up thirsty, sleepy = more thirsty
		return sleepyLevel;// if beddy-by-boo/rest, sleepy = 0
	}

	int rest() {
		return sleepyLevel = 0;
	}

	// Tick/make time pass
	int getHungerTick() {
		int tick = generator.nextInt(10);
		hungerLevel += tick;
		return hungerLevel;
	}

	int getThirstTick() {
		int tick = generator.nextInt(10);
		thirstLevel += tick;
		return thirstLevel;
	}

	int getBoredTick() {
		int tick = generator.nextInt(10);
		boredLevel += tick;
		return boredLevel;
	}

	int getSleepyTick() {
		int tick = generator.nextInt(10);
		sleepyLevel += tick;
		return sleepyLevel;
	}

}