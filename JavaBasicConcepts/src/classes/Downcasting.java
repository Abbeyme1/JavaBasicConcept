package classes;

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Boy("a",5);
//		System.out.println(human.getClass());
		
		Boy b = (Boy)human;
		
		b.call();
		
		

	}

}



class Human {
	
	public final static int eyes = 2;
	private String name;
	private int age;
	
	
	public Human(String name, int age)
	{
		setName(name);
		setAge(age);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}

class Boy extends Human{

	
	public Boy(String name, int age) {
		super(name, age);
	}
	
	public void call()
	{
		System.out.println("i am a boy");
	}
}