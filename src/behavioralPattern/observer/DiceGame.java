package behavioralPattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class DiceGame {

	protected List<Player> players = new ArrayList<>();

	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public abstract void play();


}
