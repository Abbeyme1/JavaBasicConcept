package classes;

public class Strings {

	public static void main(String[] args)
	{
		String s = "abcd";
		
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer(5);//length
		StringBuffer c = new StringBuffer(s);
		
		
		a.append("Abd");
		System.out.println(a);
		
		a.insert(2,"c"); // insert this at 2th pos.
		System.out.println(a);
		
		a.replace(2, 4, "x"); 
		System.out.println(a);
		
		a.delete(1, 2); 
		System.out.println(a);
		
		a.reverse();
		System.out.println(a);
		
		System.out.println(a.capacity());
		
		a.append("cdefghijklqwerd");
		System.out.println(a.capacity());
		
		
	}
}
