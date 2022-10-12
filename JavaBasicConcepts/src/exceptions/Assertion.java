package exceptions;

public class Assertion {
	
	
	public static void main(String[] args)
	{
		
//		int value = 22;
//		
//		assert value < 18 : value;
//		System.out.println(value);
		
		
		// ALWAYS CALL FUNC. BEFORE USING IT IN ASSERT
		
		
		
		int v = multiply(2,3);
//		assert 2*3 == v ;
//		assert 2*3 == v : "Wrong output";
		
		
		int[] arr = {2,89,85,12,66,7,1};
		
		int f = findMin(arr);
//		assert f == 2 : "Minimum value in array is 1";
		
		
		
	}
	
	
	
	public static int findMin(int[] arr)
	{
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) min = Math.min(min, arr[i]);
		
		return min;
		
	}
	
	
	public static int multiply(int a,int b)
	{
		return 1 + a*b;
	}
	
}
