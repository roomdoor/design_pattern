package behavioralPattern.observer;

import java.util.Random;

public class FairDiceGame extends DiceGame {

	private Random random = new Random();

	@Override
	public void play() {
		int diceNumber = random.nextInt(6) + 1;
		System.out.println("주사위를 굴렸습니다. 숫자는 " + diceNumber + "입니다.");

		for (Player p : players) {
			p.update(diceNumber);
		}
	}
}
