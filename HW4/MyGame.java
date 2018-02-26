package myFirstGame;

import java.util.*;

interface Commandable {

	String doCommand();

	void matchCommand(String input);

	void update(String userInput);
}

class GameController {

	private List<Commandable> commands = new ArrayList<Commandable>();
	public String input;

	public void attach(Commandable observer) {
		commands.add(observer);
	}

	public void notifyAllObservers() {
		for (Commandable observer : commands) {

			observer.update(input);
		}
	}

	public void userInput() {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a command:");
		input = reader.nextLine();
		notifyAllObservers();
		

	}

}

class HelpCommand implements Commandable {

	protected GameController subject;
	public String ip;

	public HelpCommand(GameController subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public String doCommand() {
		String message = "Help Menu:\nstart: start the game \nquit: quit the game\n";
		System.out.println(message);

		//subject.userInput();
		//System.out.println("Test this message" + message);
		return message;
	}

	public void matchCommand(String input) {

		if ("help".equals(input)) {

			doCommand();
		}

		else {

			System.out.println("Command not recognized. Please Try again..");
			subject.userInput();
		}

	}

	public void update(String userInput) {

		ip = userInput;
		matchCommand(ip);

	}
}

class QuitCommand implements Commandable {

	protected GameController subject;
	public String ip;

	public QuitCommand(GameController subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public String doCommand() {

		String message = "Quitting the game...\n";

		System.out.println(message);

		System.exit(0);

		return message;

	}

	public void matchCommand(String input) {

		if ("quit".equals(input)) {

			doCommand();

		}

	}

	public void update(String userInput) {
		ip = userInput;
		matchCommand(ip);

	}
}

public class MyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameController subject = new GameController();

		new QuitCommand(subject);
		new HelpCommand(subject);

		subject.userInput();

	}

}
