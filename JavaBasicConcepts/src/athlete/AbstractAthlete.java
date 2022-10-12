package athlete;

abstract class AbstractAthlete implements Walkable, Runnable  {
	
	private String name;
	
	public void walk () {
		System.out.println("walking");
	}
	
	public void run() {
		System.out.println("running");
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		
	}
	public AbstractAthlete(String name) {
		setName(name);
	}

	void jog() {
		System.out.println("jogging");
	}
	
	abstract void longJump();
	
}