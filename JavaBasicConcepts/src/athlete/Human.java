package athlete;

public class Human implements walkable, runnable{
	
	private String name;
	
	public Human(String name) {
		setName(name);
	}
	
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
		System.out.println("Name: "+  name);
	}
}
