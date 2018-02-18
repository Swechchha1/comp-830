import java.util.*;

interface Commandable {

	void doCommand();

	void matchCommand(String userInput);
}

class GameController {

	Commandable hc = new HelpCommand();
	Commandable qc = new QuitCommand();
	public String input;

	public void userInput() {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a command:");
		input = reader.nextLine();

		if ("quit".equals(input) || "help".equals(input)) {

			hc.matchCommand(input);
			qc.matchCommand(input);
		}

		else {

			System.out.println("Command not recognized");
		}

	}
}

class HelpCommand implements Commandable {

	public void doCommand() {
		System.out.println("Help Menu:\nstart: start the game \nquit: quit the game");
	}

	public void matchCommand(String input) {

		if ("help".equals(input)) {

			doCommand();
		}

	}
}

class QuitCommand implements Commandable {

	public void doCommand() {

		System.out.println("Quitting the game...\n");

		System.exit(0);

	}

	public void matchCommand(String input) {

		if ("quit".equals(input)) {

			doCommand();

		}

	}
}

public class MyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameController gc = new GameController();
		gc.userInput();

	}

}
