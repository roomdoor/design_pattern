package structuralPattern.adaptor.outputM;

import structuralPattern.adaptor.inputM.Pie3_5;

public class Earphones {

	private final Pie3_5 pie3_5;

	public Earphones(Pie3_5 pie3_5) {
		this.pie3_5 = pie3_5;
	}

	public void soundOut() {
		System.out.println(pie3_5.inputSignal() + "가 " + getClass().getSimpleName() + "로 출력된다.");
	}
}
