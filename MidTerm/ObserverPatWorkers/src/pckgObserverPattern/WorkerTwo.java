package pckgObserverPattern;

class WorkerTwo implements IFWorkers {

	public WorkManager subject;

	public WorkerTwo(WorkManager subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update(String ID, long WorkerID, String Message) {

		if (WorkerID == 2) {

			System.out.println("Worker " + WorkerID + " processed Work Item " + ID); // Print

			WorkerID = WorkerID + 1; // Increment

			subject.notifyAllObservers(ID, WorkerID, Message); // Return to the Work Manager

		}

	}
}

