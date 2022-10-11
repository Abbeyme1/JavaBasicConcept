package classes;

public class Strings {

	public static void main(String[] args)
	{
		String s = "abcd";
		
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer(5);//length
		StringBuffer c = new StringBuffer(s);
		
		
		a.append("Abd");
		a.append("x");
		System.out.println(a);
		
		
		a.insert(2,"c"); // insert this at 2th pos.
		System.out.println("insert = " + a);
		
		a.insert(5,"c");
		System.out.println("insert = " +  a);
		
		a.replace(2, 4, "x"); 
		System.out.println("replace = " + a);
		
		a.delete(1, 2); 
		System.out.println("delete = " + a);
		
		a.reverse();
		System.out.println("reverse = " + a);
		
		System.out.println("capactiy = " + a.capacity());
		
		a.append("cdefghijklqwerd");
		System.out.println("capacity after appending = " + a.capacity());
		
		
	}
}
