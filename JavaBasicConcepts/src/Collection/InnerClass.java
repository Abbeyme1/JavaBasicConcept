package Collection;

public class InnerClass {
	
	int x = 0;

	// nested inner class
    class InnerClasss {
    	
    	// can't have any static members
    	
    	int v;
    	int x;
        void accessMembers(int x) {
            this.x = x;
            
            System.out.println(InnerClass.this.x);
        }
    }

    
    public static void method()
    {
    	
    	class MethodClass {}
    	
    	
    	MethodClass m = new MethodClass();
    	
    }
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InnerClass.InnerClasss is = new InnerClass().new InnerClasss(); 
		
	
		Pairr p = new Pairr(10);
		p.print();
		
		
		Animall d = new Animall() {
			
			public void makeNoise()
			{
				System.out.println("yes");
			}
			
			
		};

		Car c = new Car() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		
		System.out.println(c.getClass());
		System.out.println(d.getClass());

		
	}

}


interface Car {
	
	public void run();
}

class Animall {
	
	public void makeNoise()
	{
		
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
