package oops;

public class PrimitiveTypeCasting {
	
	public static void main(String[] args)
	{
		
		int a = 5;
		
		double l = a; // automatic type casting from int to double
		System.out.println(a + " " + l);
		
		char c = 'a';
		int v = c;
		System.out.println(c + " "+ v);
		
		
		double d = 9d;
		
		int i = (int)(d); // manual
		System.out.println(d + " "+ i);
		
		
		int m = 6;
		float f = m;
		
		System.out.println(m + " " +f);
		
		
		
		
	}
}
