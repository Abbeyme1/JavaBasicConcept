package classes;


public class VariableArguements {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(3, "Abhay","Akshay","John");
		
		
		int a = 55_88;
		System.out.println(a);
		
	}
	
	
	static void print(int total, String ...names)
	{
		System.out.println("total : " + total);
		int count = 1;
		for(String name : names)
		{
			System.out.println(count++ + ": " + name);
		}
		
	}

}


