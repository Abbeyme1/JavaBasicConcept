package oops;

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test();
		Test b = new Test();
		
		
		

	}

}

class Test {
	
	// java copies this to to constructor
	{
		System.out.println("static block 0");
	}
	
	static {
		System.out.println("static block 1");
	}
	
	public Test()
	{
		System.out.println("constructor");	
	}
	
	static {
		System.out.println("static block 2");
	}
}
