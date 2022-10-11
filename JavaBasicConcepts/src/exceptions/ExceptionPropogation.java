package exceptions;

import java.io.IOException;

public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		func3();
//		func6();
		func10();
		System.out.println("error handled");

	}
	
	// unchecked
	public static void func3()
	{
		
		try {
			
			func2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void func2()
	{
		func1();
//		System.out.println("func 2 out : error not handled");
	}
	
	public static void func1()
	{
		int[] arr = new int[8];
		arr[9] = 5;
	}
	
	
	public static void func10()
	{
		
		try {
			
			func9();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("caught exception in func 10");
		}
		
	}
	
	public static void func9()
	{
		try {
			
			func8();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught exception in func9");
		}
	}
	
	public static void func8()
	{
		int c = 5/0;
	}
	
	
	
	
	
	// checked 
	public static void func6()
	{
		try {
			func5();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void func5() throws IOException
	{
		func4();
		System.out.println("func 2 out");
	}
	
	public static void func4() throws IOException
	{
		throw new IOException();
		
	}
	
	

}
