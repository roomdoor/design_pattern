package behavioralPattern.ChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new DomainHandler();
		Handler handler3 = new PortHandler();

		handler1.setNext(handler2).setNext(handler3);

		String url = "http://youtube.com:8080";
		System.out.println("INPUT: " + url);

		handler1.run(url);
	}

}
