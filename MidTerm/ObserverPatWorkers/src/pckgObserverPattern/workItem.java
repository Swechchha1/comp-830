package pckgObserverPattern;

public class workItem {

	WorkManager subject = new WorkManager();
	String ID;
	long WorkerID;
	String Message;

	public workItem(String ID, long WorkerID, String Message) {

		this.ID = ID;
		this.WorkerID = WorkerID;
		this.Message = Message;

	}
}
