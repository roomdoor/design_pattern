package behavioralPattern.observer;

public class OddBettingPlayer extends Player {


	public OddBettingPlayer(String name) {
		super(name);
	}

	@Override
	public void update(int diceNumber) {
		if (diceNumber % 2 == 1) {
			System.out.println(getName() + "는 주사위의 눈이 " + diceNumber + "이므로 홀수이기 때문에 이겼습니다!!");
		}
	}
}
