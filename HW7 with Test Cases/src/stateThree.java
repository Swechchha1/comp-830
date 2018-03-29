
public class stateThree implements State {
    
	 stateMachine statmach;
	 stateEnd s5 = new stateEnd();
	 
	 public stateThree(stateMachine statmach) {
		 this.statmach = statmach;
		 
	 }
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
		System.out.println("Still in state 3");
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Changed to state 1");
		statmach.setState(statmach.one);
			
	}

	@Override
	public void get_output() {
		// TODO Auto-generated method stub
		statmach.setEndState(statmach.end);
		s5.finish();
	}

}
