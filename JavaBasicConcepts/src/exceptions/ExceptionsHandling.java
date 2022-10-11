package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionsHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Arithmetic Exception
		try {
			
			int i = 7/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("yes");
		}
		
		try {
			
			divide(4,0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		// multiple exceptions in catch
		
		try {
			
			String s = null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException|ArithmeticException|NumberFormatException e)
		{
			// e is final here
			
			System.out.println(e);
		}
		
		
		// number format exception
		try {
			
			String s = "asdf";
			int i = Integer.parseInt(s);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		} 

		
		// ArrayIndexOutOfBound Exception
		try {
			
			int[] a = new int[5];
			a[44] = 7;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		} 
		finally
		{
			System.out.println("finally");
		} 
		
		
		
		// throw exceptions
		try {
			
			throw new ArithmeticException("arithmatic error");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		// unchecked
		validateAge(18);
		
		
		// checked
		try {
			validate();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("1) " + e);
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("2) " + e);
		}
		

		
		
		// throw user defined exception
		
		try {
			
			throw new UserDefinedException("this is a user defined exception");
		}
		catch(UserDefinedException e)
		{
			System.out.println(e);
		}

	
	}
	
	
	public static void tryWithResources() throws IOException
	{
		// try with resources statement
		
		try(FileWriter f = new FileWriter("abc.java"))
		{
			
			
		}
	}
	
	// unchecked exception
	public static void divide(int a,int b) {
		
		int v = a/b;
		System.out.println("Answer: "+ v);
		
		throw new ArithmeticException("SD");
	}

	//catch exception
	public static void openFile(String url) throws FileNotFoundException
	{
		throw new FileNotFoundException(url + ": File Not Found");
	}
	
	public static void validateAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("User is not eligible");
		}
		else System.out.println("User is eligible");
	}
	
	
	// all exceptions that this fun. may throw
	public static void validate() throws IOException,FileNotFoundException
	{
		
//		throw new IOException();
		throw new FileNotFoundException();
	}
	
}


class UserDefinedException extends Exception {
	
	public UserDefinedException(String message)
	{
		super(message);
	}
	
}
