package behavioralPattern.observer;

public class Main {

	public static void main(String[] args) {
		FairDiceGame diceGame = new FairDiceGame();

		EvenBettingPlayer player1 = new EvenBettingPlayer("참가자1");
		EvenBettingPlayer player2 = new EvenBettingPlayer("참가자2");
		OddBettingPlayer player3 = new OddBettingPlayer("참가자3");
		OddBettingPlayer player4 = new OddBettingPlayer("참가자4");

		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);
		diceGame.addPlayer(player4);

		diceGame.play();


	}

}
