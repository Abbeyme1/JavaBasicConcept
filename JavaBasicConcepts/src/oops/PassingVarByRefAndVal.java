package oops;

public class PassingVarByRefAndVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 6;
		System.out.println("v = "+ i);
		passByValue(i);
		System.out.println("v = "+ i);
		
		
		int[] arr = {1,2,3};
		System.out.println("ar[0] = "+ arr[0]);
		passByRef(arr);
		System.out.println("ar[0] = "+ arr[0]);
		
		P p = new P(5);
		System.out.println("p = "+ p.v);
		passByRef2(p);
		System.out.println("p = "+ p.v);
		
		
	}
	
	
	public static void passByValue(int v)
	{
		v = 5;
		System.out.println("v = "+ v);
	}
	
	public static void passByRef(int[] ar)
	{
		ar[0] = 5;
		System.out.println("ar[0] = "+ ar[0]);
		
	}
	
	public static void passByRef2(P p)
	{
		p.v = 99;
		System.out.println("p = "+ p.v);
		
		
	}

}

class P {
	int v;
	
	public P(int v)
	{
		this.v = v;
	}
}
