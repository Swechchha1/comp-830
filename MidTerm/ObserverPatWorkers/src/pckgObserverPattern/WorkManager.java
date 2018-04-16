package pckgObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	IFWorkers observer;
	String ID;
	long WorkerID;
	String Message;

	public List<IFWorkers> workers = new ArrayList<IFWorkers>();

	int getNumber() {
		return workers.size();
	}

	public void attach(IFWorkers observer) {
		workers.add(observer);
	}

	public String notifyAllObservers(String ID, long WorkerID, String Message) {

		String result = "Work completed on WorkItem ";

		if (WorkerID <= 4) {
			for (IFWorkers observer : workers) {

				this.ID = ID;
				this.WorkerID = WorkerID;
				this.Message = Message;

				observer.update(ID, WorkerID, Message);
			}
		} else {

			System.out.println(result + ID);
		}

		return result + ID;
	}


}
