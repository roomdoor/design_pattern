package behavioralPattern.observer;

public class EvenBettingPlayer extends Player{

	public EvenBettingPlayer(String name) {
		super(name);
	}

	@Override
	public void update(int diceNumber) {
		if (diceNumber % 2 == 0) {
			System.out.println(getName() + "는 주사위의 눈이 " + diceNumber + "이므로 짝수이기 때문에 이겼습니다!!");
		}
	}
}
