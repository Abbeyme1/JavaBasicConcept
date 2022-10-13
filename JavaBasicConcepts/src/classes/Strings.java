package classes;

public class Strings {

	public static void main(String[] args)
	{
		String a = new String();
		String b = null;
		a = a.concat(new String("cabc"));
		System.out.println(a + " "+ a.length());
		System.out.println(a.equals(b));
		
		a = a.replace("ab", "abcd");
		
		System.out.println(a + " "+ a.length());
		
		String[] splitArr = a.split("",5);
		
		for(String s : splitArr) System.out.println(s);
		
		
		String m = "a";
		String n = "appless";
		
		
		
		System.out.println("compare: " + n.compareTo(m));
		
		
		String input = "   abcd   ";
		
		System.out.println("Username:"+ input.strip());
		
//		char[] arr = ;
		StringBuffer sb = new StringBuffer("add");
		
		String value = String.valueOf(7+9);
		System.out.println(value);
//		System.out.println(a + " "+ a.length());
		
		
		
		String name1 = "abhay";
		String name2 = "abHaY";
		
		System.out.println(name1.equalsIgnoreCase(name2));
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("a");
		String s3 = "";
		StringBuffer sb4 = sb1;
		
		System.out.println("sb - sb: "+ sb1.equals(sb2));
		
		System.out.println("sb - s: " + sb1.equals(s3));
		System.out.println("s - sb.toString(): " + s3.equals(sb1.toString()));
		System.out.println("sb.toString() - s: " + sb1.toString().equals(s3));
		System.out.println("sb - sb of same ref : " + sb4.equals(sb1));
		
		
//		StringBuffer a = new StringBuffer();
		
		
//		StringBuffer b = new StringBuffer(5);//length
//		StringBuffer c = new StringBuffer(s);
//		
//		
//		a.append("Abd");
//		a.append("x");
//		System.out.println(a);
//		
//		
//		a.insert(2,"c"); // insert this at 2th pos.
//		System.out.println("insert = " + a);
//		
//		a.insert(5,"c");
//		System.out.println("insert = " +  a);
//		
//		a.replace(2, 4, "x"); 
//		System.out.println("replace = " + a);
//		
//		a.delete(1, 2); 
//		System.out.println("delete = " + a);
//		
//		a.reverse();
//		System.out.println("reverse = " + a);
//		
//		System.out.println("capactiy = " + a.capacity());
//		
//		a.append("cdefghijklqwerd");
//		System.out.println("capacity after appending = " + a.capacity());
		
		
		
		
		Editor notepad = new Editor("notepad");
		
		notepad.data = "What were they eating? \nIt didn't taste like anything she had ever eaten before and although she was famished, she didn't dare ask. \nShe knew the answer would be one she didn't want to hear.";
		
//		notepad.replace("a", "()");
//		notepad.print();
//		
//		notepad.replaceAll("a", "()");
//		notepad.print();
//		
//		notepad.find("she");
//		notepad.findAll("she");
		
//		notepad.totalWords();
		
		
		
	}
}


class Editor {
	
	String fileName = "Untitled";
	private final String ANSI_GREEN = "\u001B[32m";
	private final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	private final String ANSI_RESET = "\u001B[0m";
	String data;
	
	
	public Editor(String fileName)
	{
		this.fileName = fileName;
	}
	
	public void print()
	{
		System.out.println("-------------------------------------");
		System.out.println(data);
		System.out.println("-------------------------------------");
	}
	
	
	public void replace(String target, String replacement)
	{
		data = data.replaceFirst(target, replacement);
	}
	
	public void replaceAll(String target, String replacement)
	{
		data = data.replaceAll(target, replacement);
	}
	
	public void find(String s)
	{
		String temp = data.replaceFirst(s, ANSI_BLUE_BACKGROUND + s + ANSI_RESET);
		System.out.println("-------------------------------------");
		System.out.println(temp);
		System.out.println("-------------------------------------");
		
	}
	
	public void findAll(String s)
	{
		String temp = data.replaceAll(s, ANSI_BLUE_BACKGROUND + s + ANSI_RESET);
		System.out.println("-------------------------------------");
		System.out.println(temp);
		System.out.println("-------------------------------------");
		
	}
	
	public void totalWords()
	{
		String[] arr = data.split(" ");
		System.out.println("Count: " + arr.length);
	}
}
