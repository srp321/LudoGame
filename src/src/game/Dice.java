package src.game;

import java.util.Random;

public class Dice {

	// nextInt() gives an int from 0 to 5
	// Adding 1 to make it in the range of 1-6
	int roll() {
		return new Random().nextInt(6) + 1;
	}

}
