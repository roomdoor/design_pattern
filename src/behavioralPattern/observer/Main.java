package behavioralPattern.observer;

public class Main {

	public static void main(String[] args) {
		FairDiceGame diceGame = new FairDiceGame();
		UnFairDiceGame nDiceGame = new UnFairDiceGame(1);

		EvenBettingPlayer player1 = new EvenBettingPlayer("참가자1");
		OddBettingPlayer player2 = new OddBettingPlayer("참가자2");

		for (int i = 0; i < 6; i++) {
			NBettingPlayer player = new NBettingPlayer((i + 1) + "betting", i + 1);
			diceGame.addPlayer(player);
			nDiceGame.addPlayer(player);
		}

		diceGame.addPlayer(player1);
		nDiceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		nDiceGame.addPlayer(player2);

		diceGame.play();
		for (int i = 1; i < 7; i++) {
			System.out.println();
			nDiceGame.setN(i);
			nDiceGame.play();
		}
	}

}
