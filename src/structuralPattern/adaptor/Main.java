package structuralPattern.adaptor;

import structuralPattern.adaptor.adaptor.Jack55ToPie3_5;
import structuralPattern.adaptor.adaptor.JackCannonToJack55;
import structuralPattern.adaptor.inputM.Guitar;
import structuralPattern.adaptor.inputM.MP3;
import structuralPattern.adaptor.inputM.Mic;
import structuralPattern.adaptor.outputM.Earphones;
import structuralPattern.adaptor.outputM.GuitarEmp;

public class Main {

	public static void main(String[] args) {
		// 입력 장치
		// 	55잭  -- 기타
		// 	3.5 파이 -- MP3
		// 	캐논잭 -- 마이크

		// 출력장치
		// 	기타 엠프 - 55잭
		// 	이어폰 -- 3.5 파이

		Guitar guitar = new Guitar();
		MP3 mp3 = new MP3();
		Mic mic = new Mic();


		GuitarEmp guitarEmp = new GuitarEmp(guitar);
		Earphones earphones = new Earphones(mp3);

		guitarEmp.soundOut();
		earphones.soundOut();

		guitarEmp = new GuitarEmp(new JackCannonToJack55(mic));
		earphones = new Earphones(new Jack55ToPie3_5(new JackCannonToJack55(mic)));

		guitarEmp.soundOut();
		earphones.soundOut();


	}

}
