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
	public Boolean isQuit = false;

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
		reader.close();

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
		return message;
	}

	public void matchCommand(String input) {

		if ("help".equals(input)) {

			doCommand();
		}

		else if (!"help".equals(input) & !"quit".equals(input)) {

			System.out.println("Command not recognized");
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

		Scanner reader = new Scanner(System.in);
		System.out.println("Would you like to know your score? Type y or n");
		String inp_quit = reader.nextLine();
		finish(inp_quit);
		reader.close();
		return inp_quit;

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

	private String finish(String a) {
		if ("y".equals(a)) {

			displayScore();

		}

		else {

			System.out.println("Game Over");

		}
		return a;
	}

	private int displayScore() {
		final int score = 10;
		System.out.println("Your score is " + score);
		return score;
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
