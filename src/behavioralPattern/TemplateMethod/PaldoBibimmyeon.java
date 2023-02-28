package behavioralPattern.TemplateMethod;

public class PaldoBibimmyeon extends Ramen{

	@Override
	public void putExtra() {
	}

	@Override
	public void waitForMinutes() {
		System.out.println("5분동안 면을 익힙니다.");
	}

	@Override
	public void doSomeThingMore() {
		System.out.println("물을 버리고 면을 찬물에 식힙니다.");
	}
}
