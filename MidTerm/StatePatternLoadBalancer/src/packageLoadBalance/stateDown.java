package packageLoadBalance;

public class stateDown implements IFLoadBalancerState  {
    
	LoadBalancerMachine loadbalance;

	public stateDown(LoadBalancerMachine loadbalance) {
		this.loadbalance = loadbalance; 

	}
	
	@Override
	public void serviceEnabled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceDisabled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceHealthCheckGood() {
		// TODO Auto-generated method stub
		System.out.println("Changed to state Ready");
		loadbalance.setState(loadbalance.ready);
		
	}

	@Override
	public void serviceHealthCheckBad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serviceTimeout() {
		// TODO Auto-generated method stub
		
	}
	
}
