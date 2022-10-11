package classes;

public class Interfaces {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axis axis = new Axis();
		axis.rateOfInterest();
		
		human boy = new boy();
		boy.speak();
		
		System.out.println(boy.countOfEyes);
		System.out.println(human.countOfEyes); 
		
		
//		Student s = new Student();
//		s.read();
		
		Bank.announcement();
		
		
		
		
		

	}

}


interface Bank {
	
	
	static void announcement() {
		System.out.println("important announcement: ");
	}
	
	void rateOfInterest();
}


class Axis implements Bank {

	@Override
	public void rateOfInterest() {
		System.out.println("7.5%");
	}
}


/////


interface Runnable 
{
	void run();
}

interface Walkable
{
	void walk();
}

interface human extends Runnable, Walkable {
	
	int countOfEyes = 2;
	void speak();
	
	interface Readable {
		void read();
	}
}


class boy implements human {

	@Override
	public void walk() {
		System.out.println("Walking...");
		
	}

	@Override
	public void run() {
		System.out.println("Running...");
	}

	@Override
	public void speak() {
		System.out.println("Speaking...");
		
	}
}


//class Student implements human.Readable {
//
//	@Override
//	public void read() {
//		// TODO Auto-generated method stub
//		System.out.println("Reading...");
//		
//	}
//	
//}

