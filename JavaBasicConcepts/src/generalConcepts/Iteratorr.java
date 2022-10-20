package generalConcepts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;


public class Iteratorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<>();
		s.add(5);
		s.add(85);
		s.add(1);
		
		Enumeration<Integer> e = s.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next() + " ");
			i.remove();
		}
		
		System.out.println("size = "+  s.size());
		
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		
		ListIterator<Integer> li = l.listIterator();
		
		while(li.hasNext())
		{
			int v = li.next();
		
			System.out.println(v);
			if(v%2 == 0)
			{
				v++;
				li.set(v);
				li.add(v);
			}
//			System.out.println(li.nextIndex() + " " + li.next());
		}
		System.out.println(l);
		
//		while(li.hasPrevious())
//		{
//			System.out.println(li.previousIndex() + " " + li.previous());
//		}
		
	}

}
