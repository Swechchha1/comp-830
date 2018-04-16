package packageLoadBalance;

public class stateDisabled implements IFLoadBalancerState  {

	LoadBalancerMachine loadbalance;

	public stateDisabled(LoadBalancerMachine loadbalance) {
		this.loadbalance = loadbalance;

	}
	
	@Override
	public void serviceEnabled() {
		// TODO Auto-generated method stub
		
		System.out.println("Changed to state Unknown");
		loadbalance.setState(loadbalance.unknown);
		
	}


	@Override
	public void serviceDisabled() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void serviceHealthCheckGood() {
		// TODO Auto-generated method stub
		
		
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
