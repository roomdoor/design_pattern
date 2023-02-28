package behavioralPattern.strategy;

public class Cash implements Payment {

	int cost;

	public Cash(int cost) {
		this.cost = cost;
	}

	@Override
	public void pay() {
		System.out.println("현금으로 요금 " + cost + "원을 지불합니다.");
	}
}
