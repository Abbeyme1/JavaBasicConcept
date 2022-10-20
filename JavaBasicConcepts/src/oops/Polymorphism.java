package oops;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(add(1,2,3));
//		
//		Animal dog = new Dog();
//		dog.animalSound();
//		
//		
//		print(5);
//		
//		List<String> l = new ArrayList<>();
//		l.add("a");
//		l.add("b");
//		l.add("c");
//		
//		print(l);
//		String s = "abcde";
//		printChar(s);
		
		
		Animal b = new Cat();
		
		Animal a = new Dog();
		a.animalSound();
		a.walk();
		a.walk(5);
		
		a.eat("fish","milk");

		try {
			a.catchh(new Toy());
			a.catchh("teddy");
//			a.catchh(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}
	
	
	
	public static void print(Object a)
	{
		System.out.println(a.toString());
	}
	
	public static void printChar(CharSequence s)
	{
		System.out.println(s.charAt(0));
	}
	
	
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}

}

class Toy {
	
	public String toString()
	{
		return "toyyy";
	}
}



class Animal {

	public void animalSound()
	{
		System.out.println("animal makes a sound");
	}
	
	public void walk()
	{
		System.out.println("walk");
	}
	
	// overloading
	public void walk(int steps)
	{
		for(int i=0;i<steps;i++)
		{
			System.out.print("walk ");
		}
		System.out.println();
	}
	
	public void eat(String a)
	{
		System.out.print("Eating "+ a);
	}
	
	// Overloading
	public void eat(String ...items)
	{
		System.out.print("Eating ");
		for(String item : items)
		{
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	// object polymorphism
	public <T> void catchh(T obj) throws BadAnimal
	{
		if(obj instanceof Animal)
		{
			throw new BadAnimal("Invalid object");
		}
		System.out.println("Catch: " + obj.toString());
	}
	
	
}

class Dog extends Animal{
	
	@Override
	public void animalSound()
	{
		System.out.println("bow bow");
	}
}

class Cat extends Animal{
	
	@Override
	public void animalSound()
	{
		System.out.println("meow");
	}
}



class BadAnimal extends Exception {
	
	public BadAnimal(String message)
	{
		super(message);
	}
}