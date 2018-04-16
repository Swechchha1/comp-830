package packageLoadBalance;


import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ packageLoadBalance.LoadBalancerMachine.class })

public class testMockLB {
	
	LoadBalancerMachine loadbalance = new LoadBalancerMachine();
	
	//stateDisabled statedis = new stateDisabled(loadbalance);
	
	@Test
	public void testClassDisabled() {

		IFLoadBalancerState	disabled = loadbalance.disabled;
		IFLoadBalancerState	unknown = loadbalance.unknown;
		IFLoadBalancerState result = null;
		
		try {
			result = Whitebox.invokeMethod(loadbalance, "setState", disabled);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(result,disabled);
		loadbalance.serviceEnabled();
		
		try {
			result = Whitebox.invokeMethod(loadbalance, "setState", unknown);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(result,unknown);
		
		
	}
	@Test
	public void testClassDown() {

		IFLoadBalancerState	down = loadbalance.down;
		IFLoadBalancerState	ready = loadbalance.ready;
		IFLoadBalancerState result = null;
		
		try {
			result = Whitebox.invokeMethod(loadbalance, "setState", down);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(result,down);
		loadbalance.serviceHealthCheckGood();
		
		try {
			result = Whitebox.invokeMethod(loadbalance, "setState", ready);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(result,ready);
				
	}

}
