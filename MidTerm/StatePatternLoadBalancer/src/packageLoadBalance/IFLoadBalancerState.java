package packageLoadBalance;

public interface IFLoadBalancerState {
	
	
	void serviceEnabled();
	void serviceDisabled();
	void serviceHealthCheckGood();
	void serviceHealthCheckBad();
	void serviceTimeout();
	
}
