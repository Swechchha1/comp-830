package pckgObserverPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJWorkers {

	@Test
	void testAttach() {

		WorkManager subject = new WorkManager();

		assertEquals(0, subject.getNumber());
		new WorkerOne(subject); // Testing for WorkerOne class
		assertEquals(1, subject.getNumber());
		new WorkerTwo(subject); // Testing for WorkerTwo class
		assertEquals(2, subject.getNumber());
		new WorkerThree(subject); // Testing for WorkerThree class
		assertEquals(3, subject.getNumber());
		new WorkerFour(subject); // Testing for WorkerFour class
		assertEquals(4, subject.getNumber());

	}

	@Test
	void testNotifyAll() {

		WorkManager subject = new WorkManager();

		assertEquals("Work completed on WorkItem WI5", subject.notifyAllObservers("WI5", 5, "Project work 5"));
	}

}
