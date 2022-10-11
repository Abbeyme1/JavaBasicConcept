package athlete;

abstract class athlete extends Human {
	
	public athlete(String name) {
		super(name);
	}

	void jog() {
		System.out.println("jogging");
	}
	
	abstract void longJump();
	
}