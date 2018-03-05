package myFirstGame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ QuitCommand.class })

public class TestPMock {
	GameController subject = new GameController();
	QuitCommand qc = new QuitCommand(subject);

	@Test
	public void testFinishMethod() {

		String input = "y";
		String result = null;

		try {
			result = Whitebox.<String>invokeMethod(qc, "finish", input);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(result, input);

	}

	@Test
	public void testScoreMethod() {

		int result = 0;
		final int score = 10;

		try {
			result = Whitebox.<Integer>invokeMethod(qc, "displayScore");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(result, score);
	}

}
