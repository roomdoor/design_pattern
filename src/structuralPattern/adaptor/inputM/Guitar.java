package structuralPattern.adaptor.inputM;

public class Guitar implements Jack55 {

	@Override
	public String inputSignal() {
		return getClass().getSimpleName() + "에서 [55잭]으로 보낸 신호";
	}
}
