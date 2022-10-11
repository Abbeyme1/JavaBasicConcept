package operators;

public class Operators {

	public static void main(String[] args) {
		

		// assignment
		
		int num = 5; // simple
		num += 8; // compound
		String s = "abcd" + "mcop";
		
		
		// relational
		
		int a = 5;
		int b = 10;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a < b);
		

		
		// arithmatic
		
		int c = a+b;
		c = a - b;
		c = a / b;
		c = a * b;
		c = a % b;
		
		System.out.println(5 % 1);
		// Increament and Decreement Operator
		
		a++;
		++a;
		a--;
		--a;
		
		
		// conditional operator
		
		int x = 5, y = 10;
		System.out.println(x == 5 && y == 10); // and
		System.out.println(x < 5 || y <= 10); // or
		System.out.println(x == 5 ? "true" : "false"); // ternary
		
		
		//logical
		System.out.println(x == 5 && y == 10); // and
		System.out.println(x < 5 || y <= 10); // or
		System.out.println(!(x == 5)); // not
		
		
		
		
	}

}

