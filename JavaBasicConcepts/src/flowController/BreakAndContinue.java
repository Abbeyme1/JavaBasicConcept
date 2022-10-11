package flowController;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		
		int[][] arr = { {1,2,3}, {4,5,6}, {7,5,9} };
		
		int findNumber = 5;
		
		find:
			for(int[] a : arr)
			{
				for(int e : a)
				{
					if(e == findNumber)
					{
						System.out.println("found : "+ findNumber);
						break find;
					}
				}
				
			}
		
		
		find:
			for(int[] a : arr)
			{
				for(int e : a)
				{
					if(e == findNumber)
					{
						System.out.println("found : "+ findNumber);
						continue find;
					}
				}
				
				System.out.println("row over");
				
			}
		
	}

}

