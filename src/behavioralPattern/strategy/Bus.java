package behavioralPattern.strategy;

public class Bus implements Transportation {

	@Override
	public void move(String start, String end) {
		System.out.println("Bus 를 타고 " + start + "에서 " + end + "까지 이동합니다.");
	}
}
