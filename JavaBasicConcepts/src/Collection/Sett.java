package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> l = Arrays.asList(5,5,2,1,11,99, 85 , 25, 745);
		
		Set<Integer> hashSet = new HashSet<>(l);
		
		System.out.println(hashSet.add(5));
		System.out.println(hashSet.remove(5));
		
		
		System.out.println(hashSet);
		
		Set<Integer> sorted = new TreeSet<>(hashSet);
		
		System.out.println(sorted);
		
		
		Set<Integer> a = new HashSet<>(Arrays.asList(1,2,8,9)); 
		Set<Integer> b = new HashSet<>(Arrays.asList(8,1,5,6)); 
		
//		a.retainAll(b);
		a.removeAll(b);
		System.out.println(a);
		
		for(int i : a) System.out.println(i);
		
		
		Iterator<Integer> i = a.iterator();
		
		while(i.hasNext()) {System.out.println(i.next());}
		
		
		
		
		

	}

}
