package behavioralPattern.strategy;

public class PeopleWithMovement {

	private Transportation transportation;
	private Payment payment;

	public PeopleWithMovement(Transportation transportation, Payment pay) {
		this.transportation = transportation;
		this.payment = pay;
	}

	public void move(String start, String end) {
		transportation.move(start, end);
	}

	public void pay() {
		this.payment.pay();
	}

	public void changeTransportation(Transportation transportation) {
		this.transportation = transportation;
	}

	public void changePayment(Payment pay) {
		this.payment = pay;
	}
}