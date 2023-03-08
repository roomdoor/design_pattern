package structuralPattern.adaptor.outputM;

import structuralPattern.adaptor.inputM.Jack55;

public class GuitarEmp {

	private final Jack55 jack55;

	public GuitarEmp(Jack55 jack55) {
		this.jack55 = jack55;
	}

	public void soundOut() {
		System.out.println(jack55.inputSignal() + "가 " + getClass().getSimpleName() + "로 출력된다.");
	}
}
