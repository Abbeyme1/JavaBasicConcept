package Collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Listt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(1);
		
		l.set(0, 2);
		
//		System.out.println(l.size());
		
		
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(l);
		
		
		List<Integer> number = Arrays.asList(2,3,4,5); 
		
	    List<Integer> square = number.stream().map(x -> x*x). 
	                           collect(Collectors.toList()); 
	    
	    Collections.shuffle(square, new Random());
	    
	    
	    System.out.println(square); 
	    
	    
	    List<Integer> sl = square.subList(1, 3); // 1 2
	    sl.set(0, 99); // square(1, 99);
	    
	    System.out.println(square);
	    System.out.println(sl);
	    
//	    sl.clear();
	    
	    System.out.println(square);
	    System.out.println(sl);
	    
	    int[] a = {1,2,3};
	    
	   	Collections.sort(sl);
	   	
	   	System.out.println(square);
	   	
	    System.out.println(sl);
	    
	    
	    ArrayList<Integer> ll = new ArrayList<>();
	    

	    
	    
	    ll.add(5);
	    ll.set(0,21);
	    ll.remove(0);
	    
	    System.out.println(ll + " " + sl);
	    
	    System.out.println(ll.contains(21));
	    
	    
	    List<Integer> lld = new LinkedList<>();
	    
	    lld.add(1);
	    lld.add(30);
	    lld.add(55);
	    lld.set(0, 5);
	    lld.remove(0);
	    
	    lld.add(1, 5);
	    
	    System.out.println(lld);
	    
	    List<Integer> safeList = Collections.synchronizedList(lld);
	    safeList.set(0, 8);
	    
	    System.out.println(safeList + " "+  lld);
	    
	    
	    List<Integer> lll = new ArrayList<>();
	    
	    
	    
	    Stream<Integer> st = lld.stream();
	    System.out.println(st);
	    
		

	}

}
