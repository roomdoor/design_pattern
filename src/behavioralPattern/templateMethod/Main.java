package behavioralPattern.templateMethod;

public class Main {

	public static void main(String[] args) {
		Ramen jin = new JinRamen();
		jin.makeRamen();

		System.out.println();
		Ramen paldo = new PaldoBibimmyeon();
		paldo.makeRamen();
	}

}
