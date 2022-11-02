package classes;


public class Interfaces {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Axis axis = new Axis();
		axis.rateOfInterest();
		
		humann boy = new boyy();
		boy.speak();
		
		System.out.println(boy.countOfEyes);
		System.out.println(humann.countOfEyes); 
		
		
//		Student s = new Student();
//		s.read();
		
//		Bank.announcement();
		
		P d = new P();
		d.a();
		
	
		
		
		

	}

}


interface Bank {
	
	
	void announcement();
	
	void rateOfInterest();
}


class Axis implements Bank {

	@Override
	public void rateOfInterest() {
		System.out.println("7.5%");
	}

	@Override
	public void announcement() {
		// TODO Auto-generated method stub
		
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

interface humann extends Runnable, Walkable {
	
	int countOfEyes = 2;
	void speak();
	
	interface Readable {
		void read();
	}
}


class boyy implements humann {

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


interface M
{
	default void a() {
		System.out.println("M");
	};
}

interface N
{
	default void a() {
		System.out.println("N");
	};
}

class O implements M,N {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("O");
	}
	
}


class P extends O implements M {
	
	
}

