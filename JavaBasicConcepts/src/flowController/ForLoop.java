package flowController;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
				System.out.println("i="+i + ", j="+j + " = "+ arr[i][j]);
		
		
		for(int[] ar : arr)
			for(int e : ar) System.out.println(e);
	}

}
