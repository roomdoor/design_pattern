package behavioralPattern.commend;

public class Button {
	private Command command;

	public Button(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		this.command.execute();
	}
}
