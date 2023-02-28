package behavioralPattern.strategy;

public class Main {

	public static void main(String[] args) {
		PeopleWithMovement peopleWithMovement = new PeopleWithMovement(new Bike());
		peopleWithMovement.move("서울", "대구");
		peopleWithMovement = new PeopleWithMovement(new Bus());
		peopleWithMovement.move("대구", "부산");
	}

}
