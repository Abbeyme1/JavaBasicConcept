package Collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.InternalFrameListener;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pair<Integer> p = new Pair<>(5);
//		
//		Pair<Float> fp = new Pair<>(5.6f);
//		p.print();
//		
//		fp.print();
//		
		
		
		Pair<Dog> p = new Pair<>(new Dog());
		p.print();
		
		makeSound(new Dog(), new Cat());
		
		List<Long> l = new ArrayList<>();
		l.add(5l);
		l.add(6l);
		
		printer(l);
		
		
		makeSound(new Dog(), new ArrayList<>());
		
		
		
		Number[] numArr = new Number[20];
		numArr[0] = 2d;
		numArr[1] = 6.5;
		
		
		// covarience
		Integer[] a = new Integer[6];
		
		Number[] numArr1 = a;
		
		numArr1[0] = 5.2;
		
		
		List<Integer> list = new ArrayList<>();
		
		List<Number> numList = new ArrayList<>();
		
//		numList = list; // wrong
		
//		List<? super Integer> superList = numList; // ok
		
		List<? super Integer> superList = list;
		
		

		
		// covariece
		List<? extends Number> nums = new ArrayList<>();
		
		nums.add(6);
		
		
		// contravarience
		List<? super Number> onums = new ArrayList<>();
		
		onums.add(6);
		onums.add(6.5f);
		
		
	}
	
	
	private static <T extends Animal,V> void makeSound(T t, V v)
	{
		System.out.println(t + " -- " + v);
	}
	
	// wildcard
//	private static void printer(List<? extends Number> l)
//	{
//		
//		for(Number t : l) System.out.println(t);
//	}
	
	private static void printer(List<?> l)
	{
		
		for(Object t : l) System.out.println(t);
	}

}







class Pair <T extends Animal> {
	
	T i;
	
	public Pair (T i)
	{
		this.i = i;
	}
	
	
	public void print()
	{
		i.walk();
		System.out.println("i = "+i);
	}
	
}


class Animal {
	
	public void walk()
	{
		System.out.println("walking");
	}
}

class Dog extends Animal{
	
	public void walk()
	{
		System.out.println("dog walking");
	}
}


class Cat extends Animal{
	
	public void walk()
	{
		System.out.println("cat walking");
	}
}

