package util;

import java.util.Random;

public class BasePage {

	public int randomNumber(int bound) {
		Random rand = new Random();
		int randNum = rand.nextInt(bound);
		return randNum;
	}
}
