package athlete;

public class Swimmer extends AbstractAthlete {

	public Swimmer(String name) {
		super(name);
	}

	@Override
	void longJump() {
		// TODO Auto-generated method stub
		System.out.println("swimmer jumps ");
		
	}
	
	@Override
	public void printInfo() {
		System.out.println("Swimmer Name: "+  getName());
	}
	
}
