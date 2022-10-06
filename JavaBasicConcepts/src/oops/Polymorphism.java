package oops;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,2,3));
		
		Animal dog = new Dog();
		dog.animalSound();
		
		
		print(5);
		
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		
		print(l);
		String s = "abcde";
		printChar(s);
		

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



class Animal {

	public void animalSound()
	{
		System.out.println("animal makes a sound");
	}
	
}

class Dog extends Animal{
	
	public void animalSound()
	{
		System.out.println("bow bow");
	}
}