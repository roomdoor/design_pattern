package builder;

public class Main {

	public static void main(String[] args) {

		Car car = new CarBuilder()
			.setEngine("스포츠엔진")
			.setColor("빨강")
			.setAirbag(true)
			.setCameraSensor(true)
			.setAEB(true)
			.build();

		Car car1 = new CarBuilder()
			.setEngine("트럭엔진")
			.setColor("흰색")
			.setAirbag(true)
			.setCameraSensor(false)
			.setAEB(true)
			.build();

		System.out.println(car);
		System.out.println(car1);
	}
}
