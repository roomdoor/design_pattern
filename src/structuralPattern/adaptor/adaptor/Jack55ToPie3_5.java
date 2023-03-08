package structuralPattern.adaptor.adaptor;

import structuralPattern.adaptor.inputM.Jack55;
import structuralPattern.adaptor.inputM.Pie3_5;

public class Jack55ToPie3_5 implements Pie3_5 {

	private final Jack55 jack55;


	public Jack55ToPie3_5(Jack55 jack55) {
		this.jack55 = jack55;
	}


	@Override
	public String inputSignal() {
		return jack55.inputSignal();
	}
}
