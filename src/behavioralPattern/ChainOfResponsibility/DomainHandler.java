package behavioralPattern.ChainOfResponsibility;

public class DomainHandler extends Handler {

	@Override
	protected void process(String url) {
		int startIndex = url.indexOf("://");
		int endIndex = url.lastIndexOf(":");

		System.out.print("DOMAIN: ");
		if (startIndex == -1) {
			if (endIndex == -1) {
				System.out.println(url);
			} else {
				System.out.println(url.substring(0, endIndex));
			}
		} else if (startIndex != endIndex) {
			System.out.println(url.substring(startIndex + 3, endIndex));
		} else if (startIndex == endIndex) {
			System.out.println(url.substring(startIndex + 3));
		} else {
			System.out.println("NONE");
		}
	}
}
