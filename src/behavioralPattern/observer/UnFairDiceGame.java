package behavioralPattern.observer;


public class UnFairDiceGame extends DiceGame {

	int n;

	public UnFairDiceGame(int n) {
		this.n = n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public void play() {
		System.out.println("주사위를 굴렸습니다. 숫자는 " + n + "입니다.");

		for (Player p : players) {
			p.update(n);
		}
	}
}
