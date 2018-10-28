import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	
	private int rollNumber;
	
	public int diceRoll() {
		rollNumber = ThreadLocalRandom.current().nextInt(1,7);
		System.out.println(rollNumber);
		return rollNumber;
	}

}