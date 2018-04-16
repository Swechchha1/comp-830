package pckgObserverPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ WorkManager.class })

class TestMockWorkerM {

	WorkManager wm = new WorkManager();

	@Test
	void test() {

		int result = 0;

		try {
			result = Whitebox.invokeMethod(wm, "getNumber");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		assertEquals(result, 0);

		new WorkerOne(wm); // Testing for WorkerOne class

		try {
			result = Whitebox.invokeMethod(wm, "getNumber");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		assertEquals(result, 1);

		new WorkerTwo(wm); // Testing for WorkerTwo class

		try {
			result = Whitebox.invokeMethod(wm, "getNumber");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		assertEquals(result, 2);

		new WorkerThree(wm); // Testing for WorkerThree class

		try {
			result = Whitebox.invokeMethod(wm, "getNumber");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		assertEquals(result, 3);

		new WorkerFour(wm); // Testing for WorkerFour class

		try {
			result = Whitebox.invokeMethod(wm, "getNumber");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		assertEquals(result, 4);
	}
	

}
