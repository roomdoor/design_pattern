package behavioralPattern.templateMethod;

public abstract class Ramen {

	public void makeRamen() {
		boilWater();
		putNoodles();
		putExtra();
		waitForMinutes();
		doSomeThingMore();
	}

	public void boilWater() {
		System.out.println("물을 끓인다.");
	}

	public void putNoodles() {
		System.out.println("면을 넣는다.");
	}

	public abstract void putExtra();

	public abstract void waitForMinutes();

	public abstract void doSomeThingMore();

}
