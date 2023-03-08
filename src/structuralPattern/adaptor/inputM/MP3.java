package structuralPattern.adaptor.inputM;

public class MP3 implements Pie3_5 {

	@Override
	public String inputSignal() {
		return getClass().getSimpleName() + "에서 [3.5Pie잭]으로 보낸 신호";
	}
}
