package structuralPattern.adaptor.adaptor;

import structuralPattern.adaptor.inputM.Jack55;
import structuralPattern.adaptor.inputM.Pie3_5;

public class Pie3_5ToJack55 implements Jack55 {

	private final Pie3_5 pie3_5;

	public Pie3_5ToJack55(Pie3_5 pie3_5) {
		this.pie3_5 = pie3_5;
	}

	@Override
	public String inputSignal() {
		return pie3_5.inputSignal();
	}
}
