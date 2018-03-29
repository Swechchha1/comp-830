import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class stateTestCase {
	
	stateMachine sm_obj = new stateMachine();
	//stateOne sm_one = new stateOne(sm_obj);
	State s1 = null;
	State s2 = null;
	State s3 = null;
	State s4 = null;
	State s5 = null;
	stateOne oneSt = new stateOne(sm_obj); 
	stateTwo twoSt = new stateTwo(sm_obj);
	stateThree threeSt = new stateThree(sm_obj);
	stateFour fourSt = new stateFour(sm_obj);
	stateEnd endSt = new stateEnd();
    
	@Test
	void test() {
	
		s1 = oneSt; 
		s2 = sm_obj.two;
		s3 = sm_obj.three;
		
		//Test case for stateOne 
		assertEquals(s1,sm_obj.setState(oneSt)); // setState method will return the current state which must be equal to that state's object reference
		sm_obj.create();
		assertEquals(s1,sm_obj.state);
		sm_obj.run();
		assertEquals(s2,sm_obj.state);
		sm_obj.setState(oneSt);
		sm_obj.get_output();
		assertEquals(s3,sm_obj.state);
		
	}

	
	@Test
	void test_two() {
	
		s2 = twoSt;
		s1 = sm_obj.one;
		s3 = sm_obj.three;
		s4 = sm_obj.four;
		//Test case for stateOne 
		assertEquals(s2,sm_obj.setState(twoSt)); // setState method will return the current state which must be equal to that state's object reference
		sm_obj.create();
		assertEquals(s1,sm_obj.state);
		sm_obj.setState(twoSt);
		sm_obj.run();
		assertEquals(s4,sm_obj.state);
		sm_obj.get_output();
		assertEquals(s3,sm_obj.state);
		
	}
	

	@Test
	void test_three() {
	
		s3 = threeSt;
		s1 = sm_obj.one;
		s2 = sm_obj.two;
		s4 = sm_obj.four;
		//Test case for stateOne 
		assertEquals(s3,sm_obj.setState(threeSt)); // setState method will return the current state which must be equal to that state's object reference
		sm_obj.create();
		assertEquals(s3,sm_obj.state);
		sm_obj.run();
		assertEquals(s1,sm_obj.state);
		
		//sm_obj.get_output() This will be the end state, which not State type.
		
	}
	
	
	@Test
	void test_four() {
	
		s3 = sm_obj.three;
		s1 = sm_obj.one;
		s2 = sm_obj.two;
		s4 = fourSt;
		//Test case for stateOne 
		
		assertEquals(s4,sm_obj.setState(fourSt)); // setState method will return the current state which must be equal to that state's object reference
		sm_obj.create();
		assertEquals(s1,sm_obj.state);
		sm_obj.run();
		assertEquals(s2,sm_obj.state);
		
		sm_obj.get_output();
		assertEquals(s3,sm_obj.state); 
		
	}
	
	
}
