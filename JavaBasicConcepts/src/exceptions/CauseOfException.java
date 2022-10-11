package exceptions;

import java.io.FileNotFoundException;




public class CauseOfException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			div();
			divide();
//			divide2();
		}
		catch (Throwable e) {
			System.out.println("cause : " + e.getCause());
			
		}

	}
	
	
	public static void div() 
	{
		int c = 5/0;
	}

	
	public static void divide() 
	{
		try {
			int i = 5/0;
		}
		catch(ArithmeticException e)
		{
			ArithmeticException a = new ArithmeticException();
			a.initCause(e);
			
			throw a;
			
		}
	}
	
	public static void divide2() throws Throwable 
	{
//		ArithmeticException a = new ArithmeticException();
//		a.initCause(new Throwable() );
//		throw a;
		try {
			int i = 5/0;
		}
		catch(ArithmeticException le)
		{
			Throwable high = new Throwable();
			high.initCause(le);
			
			throw high;
		}
		
	}
	
	
	public static void readFile() throws FileNotFoundException
	{
		try
		{
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException e)
		{
			FileNotFoundException f = new FileNotFoundException();
			f.initCause(e);
			
			throw f;
			
		}
	}
	
}

