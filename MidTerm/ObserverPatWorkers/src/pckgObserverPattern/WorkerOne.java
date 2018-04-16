package pckgObserverPattern;

class WorkerOne implements IFWorkers {

	public WorkManager subject;

	public WorkerOne(WorkManager subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update(String ID, long WorkerID, String Message) {

		if (WorkerID == 1) {

			System.out.println("Worker " + WorkerID + " processed Work Item " + ID); // Print

			WorkerID = WorkerID + 1; // Increment

			subject.notifyAllObservers(ID, WorkerID, Message); // Return to Work Manager

		}
	}

}