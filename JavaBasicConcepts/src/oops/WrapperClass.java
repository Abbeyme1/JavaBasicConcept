package oops;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 8;
		
		Integer a = i; // autoboxing
		Integer b = new Integer(i); // boxing
		
		
		int ov = b; // autounboxing
		int v = a.intValue(); // unboxing
		
		
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		list.add(5); // autoboxing
		list.add(110);
		
		
		int elem = list.get(0); // unboxing
		
		
		
		

	}

}
