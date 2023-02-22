package fatoryMethod;

public class Main {

	public static void main(String[] args) {

		Factory itemFactory = new ItemFactory();

		Item shield = itemFactory.create("shield");
		Item sword = itemFactory.create("sword");

		shield.use();
		sword.use();
	}
}