package behavioralPattern.observer;

public class NBettingPlayer extends Player{

	int n;
	public NBettingPlayer(String name, int n) {
		super(name);
		this.n = n;
	}

	@Override
	public void update(int diceNumber) {
		if (diceNumber == n) {
			System.out.println(getName() + "는 주사위의 눈이 " + diceNumber + "이므로 때문에 이겼습니다!!");
		}
	}
}
