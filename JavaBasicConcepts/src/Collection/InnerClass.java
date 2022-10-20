package Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class InnerClass {
	
	int x = 0;

    class InnerClasss {
    	
    	int x;
        void accessMembers(int x) {
            this.x = x;
            
            System.out.println(InnerClass.this.x);
        }
    }

    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pairr p = new Pairr(10);
		p.print();

		
	}

}



class Pairr {
	
	private int size;
	private int[] arr;
	
	public Pairr(int size)
	{
		
		this.size = size;
		arr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i] = i;
		}
	}
	
	
	public void print()
	{
		EvenIterator i = this.new EvenIterator();
		while(i.hasNext()) System.out.println(i.next());
	}
	
	
	private class EvenIterator implements java.util.Iterator<Integer> {

		int next = 0;
		
		public boolean hasNext() {
			
			return next < size;
		}

		@Override
		public Integer next() {
			
			int i = arr[next];
			
			next += 2;
			
			return i;
		}
		
	}
}
