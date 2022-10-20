package Collection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new ArrayDeque<>(2);
		
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
		System.out.println("-------");
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(5);
		pq.add(1);
		pq.add(3);
		
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
		
		

	}

}
