
public class stateMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stateMachine statmach = new stateMachine();
		stateOne s1 = new stateOne(statmach);
		stateTwo s2 = new stateTwo(statmach);
		stateThree s3 = new stateThree(statmach);
		stateFour s4 = new stateFour(statmach);
		s1.create();
		s1.run();
		s1.get_output();
		s2.create();
		s2.run();
		s2.get_output();
		s3.create();
		s3.run();
		s3.get_output();
		s4.create();
		s4.run();
		s4.get_output();
		
	}

}
