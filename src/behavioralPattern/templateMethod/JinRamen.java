package behavioralPattern.templateMethod;

public class JinRamen extends Ramen {

	@Override
	public void putExtra() {
		System.out.println("계란을 넣습니다.");
	}

	@Override
	public void waitForMinutes() {
		System.out.println("4분동안 면을 익힙니다.");
	}

	@Override
	public void doSomeThingMore() {
		System.out.println("취향에 맞게 후추, 참기름, 파 등을 추가합니다.");
	}
}
