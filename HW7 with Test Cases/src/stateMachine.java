
public class stateMachine {

	State one, two, three, four;
	State state = null;
    stateEnd end;
	
	public stateMachine() {

		one = new stateOne(this);
		two = new stateTwo(this);
		three = new stateThree(this);
		four = new stateFour(this);
		end = new stateEnd();

		state = one;
	}

	public void create() {

		state.create();

	}

	
   public void run() {	

		state.run();
        
	}

	public void get_output() {

		state.get_output();

	}

	public State setState(State state) { // Allows other objects to transition the machine to a different state

		this.state = state;
		return state;
	}
    
	public void setEndState(stateEnd end) {
		this.end = end;
	}
}
