package packageLoadBalance;

public class LoadBalancerMachine {
	

	IFLoadBalancerState unknown, ready, disabled, down;
	IFLoadBalancerState state = null;
	
	public LoadBalancerMachine() {

		unknown = new stateUnknown(this);
		ready = new stateReady(this);
		disabled = new stateDisabled(this);
		down = new stateDown(this);

		state = unknown;
	}

	public void serviceEnabled() {

		state.serviceEnabled();

	}

	
   public void serviceDisabled() {	

		state.serviceDisabled();
        
	}

	public void serviceHealthCheckGood() {

		state.serviceHealthCheckGood();

	}
   
	
	public void serviceHealthCheckBad() {
		
		
		state.serviceHealthCheckBad();
	}
	
	
	public void serviceTimeout() {
		
		state.serviceTimeout(); 
	}
	

	public IFLoadBalancerState setState(IFLoadBalancerState state) { // Allows other objects to transition the machine to a different state

		this.state = state;
		return state;
	}
    
}


