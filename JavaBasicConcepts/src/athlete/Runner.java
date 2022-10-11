package athlete;

public class Runner extends athlete {

	public Runner(String name) {
		super(name);
	}
	
	@Override
	void longJump() {
		// TODO Auto-generated method stub
		
		System.out.println("runner jumps ");
		
	}
	
	@Override
	public void printInfo() {
		System.out.println("Runner Name: "+  getName());
	}
	
	public void runnerRuns()
	{
		
	}
	
}