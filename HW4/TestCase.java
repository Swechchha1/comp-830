package myFirstGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCase {

	public String message = "Help Menu:\nstart: start the game \nquit: quit the game\n";
	
	GameController subject = new GameController();
	HelpCommand hc = new HelpCommand(subject);
	
	/*
	@Test
    public void testHelpConstructor() {
		final HelpCommand testHc = new HelpCommand(subject);
		assertTrue(testHc.equals(hc));
	}
	*/
	
	@Test
	public void test() {
		
		assertEquals(message, hc.doCommand());

	}
	/*
	@Test
	public void failTest() {
		
		message= message + "test";
		assertEquals(message, hc.doCommand());

	}
	*/
}