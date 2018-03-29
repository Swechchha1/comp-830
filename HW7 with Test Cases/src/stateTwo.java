
public class stateTwo implements State {

	 stateMachine statmach;
		
	 public stateTwo(stateMachine statmach) {
		 this.statmach = statmach;
		 
	 }
	
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
		System.out.println("Changed to state 1");
		statmach.setState(statmach.one);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Changed to state 4");
		statmach.setState(statmach.four);
		
	}

	@Override
	public void get_output() {
		// TODO Auto-generated method stub
		
		System.out.println("Changed to state 3");
		statmach.setState(statmach.three);
		
	}

}
