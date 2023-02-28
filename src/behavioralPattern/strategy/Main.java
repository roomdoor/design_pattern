package behavioralPattern.strategy;

public class Main {

	public static void main(String[] args) {
		PeopleWithMovement peopleWithMovement = new PeopleWithMovement(new Bike(), new Cash(100));
		peopleWithMovement.move("서울", "대구");
		peopleWithMovement.pay();
		peopleWithMovement.changeTransportation(new Bus());
		peopleWithMovement.changePayment(new Card(200));
		peopleWithMovement.move("대구", "부산");
		peopleWithMovement.pay();
	}

}
