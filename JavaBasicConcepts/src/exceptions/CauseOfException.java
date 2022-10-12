package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CauseOfException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
//			div();
//			divide();
//			divide2();
			
//			readFile();
			
			
			driveCar();
		}
		catch (Exception e) {
			
			System.out.println("cause : "+ e);
			System.out.println("caused : " + e.getCause());
			
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
	
	
	public static void readFile() throws Exception
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(Throwable e)
		{
			
			Exception ee = new Exception("0/0 ");
			ee.initCause(e);

			throw ee;
			
		}
	}
	
	
	public static void driveCar() throws Exception{
		
		try {
			
			throw new FlatTireException("punctured");
			
		}
		catch(Exception e)
		{
			CarNotMovingException h = new CarNotMovingException("car stopped");
			
			h.initCause(e);
			
			throw h;
		}
	}
}



class FlatTireException extends Exception{
	
	public FlatTireException(String message)
	{
		super(message);
		
	}
}

class CarNotMovingException extends Exception{
	
	public CarNotMovingException(String message)
	{
		super(message);
		
	}
}

