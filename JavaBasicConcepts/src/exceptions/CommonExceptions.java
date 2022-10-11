package exceptions;

public class CommonExceptions {
	
	public static void main(String[] args)
	{
		// ClassNotFoundException
		try {
			
			fn();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void fn() throws ClassNotFoundException
	{
//		Class a = new m();
	}

}

