package behavioralPattern.strategy;

public class Free implements Payment{

	@Override
	public void pay() {
		System.out.println("요금이 무료 입니다.");
	}
}
