
public class stateOne implements State {

	stateMachine statmach;

	public stateOne(stateMachine statmach) {
		this.statmach = statmach;

	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

		System.out.println("Still in state 1");

	}

	@Override
	// public void run() {
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Changed to state 2");
		statmach.setState(statmach.two);
        
	}

	@Override
	public void get_output() {
		// TODO Auto-generated method stub
		System.out.println("Changed to state 3");
		statmach.setState(statmach.three);
        
	}

}
