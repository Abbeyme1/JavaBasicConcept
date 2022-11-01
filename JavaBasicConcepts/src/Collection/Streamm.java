package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {
	
	
	public static void main(String... args)
	{
		
		
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(2);
		l.add(6);
		l.add(7);
	
		List<Integer> evenL = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(evenL);
		
//		Stream<Integer> s = Stream.empty();
		
		
		
		String[] names = {"Abhay","Bob","Charlie","Akshay","Akhil"};
		
		Stream<String> s = Stream.of(names);
		
//		Stream<Objects> s = Stream.builder().build();
		
		
		s.forEach(e -> System.out.println(e));
	
		
		List<Integer> square = l.stream().map(e -> e*e).sorted().collect(Collectors.toList());
		System.out.println(square);
		
		List<String> namesA = Stream.of(names).filter(e -> e.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println(namesA);
		 
		
		
		// find max
		
		int max = l.stream().max((a,b) -> a-b).get();
		System.out.println(max);
		
		
		
		
	}

}
