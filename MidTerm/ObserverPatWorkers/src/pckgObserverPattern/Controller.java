package pckgObserverPattern;

class Controller {

	public static void main(String... args) {

		WorkManager subject = new WorkManager();

		new WorkerOne(subject);
		new WorkerTwo(subject);
		new WorkerThree(subject);
		new WorkerFour(subject);

		String ID = "W1";
		long WorkerID = 1;
		String Message = "Project 1";

		workItem WI1 = new workItem(ID, WorkerID, Message);
		subject.notifyAllObservers(ID, WorkerID, Message);
		workItem WI2 = new workItem("W2", 2, "Project 2");
		subject.notifyAllObservers("W2", 2, "Project 2");
		workItem WI3 = new workItem("W3", 3, "Project 3");
		subject.notifyAllObservers("W3", 3, "Project 3");
		workItem WI4 = new workItem("W4", 4, "Project 4");
		subject.notifyAllObservers("W4", 4, "Project 4");

	}
}
