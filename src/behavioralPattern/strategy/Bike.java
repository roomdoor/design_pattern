package behavioralPattern.strategy;

public class Bike implements Transportation {

	@Override
	public void move(String start, String end) {
		System.out.println("Bike 를 타고 " + start + "에서 " + end + "까지 이동합니다.");
	}
}
