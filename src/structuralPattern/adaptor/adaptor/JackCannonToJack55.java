package structuralPattern.adaptor.adaptor;

import structuralPattern.adaptor.inputM.Jack55;
import structuralPattern.adaptor.inputM.JackCannon;

public class JackCannonToJack55 implements Jack55 {

	private final JackCannon jackCannon;

	public JackCannonToJack55(JackCannon jackCannon) {
		this.jackCannon = jackCannon;
	}

	@Override
	public String inputSignal() {
		return jackCannon.inputSignal();
	}
}
