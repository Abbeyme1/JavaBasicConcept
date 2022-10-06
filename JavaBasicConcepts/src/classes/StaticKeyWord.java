package classes;

public class StaticKeyWord {

	static class Counter {
		static int count = 0;
		
		public Counter()
		{
			count++;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter one = new Counter();
		Counter two = new Counter();
		
		System.out.println("total counter : " + Counter.count);
		
		
	}

}

