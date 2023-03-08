package structuralPattern.adaptor.inputM;

public class Mic implements JackCannon{

	@Override
	public String inputSignal() {
		return getClass().getSimpleName() + "에서 [캐논잭]으로 보낸 신호";
	}
}
