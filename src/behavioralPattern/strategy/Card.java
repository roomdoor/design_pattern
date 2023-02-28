package behavioralPattern.strategy;

public class Card implements Payment {

	int cost;

	public Card(int cost) {
		this.cost = cost;
	}
	@Override
	public void pay() {
		System.out.println("카드로 요금 " + cost + "원을 지불합니다.");
	}
}
