package exceptions;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "asdfjklmnko";
		String s2 = "mcno";
		
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("k", 6));
		
		char[] arr = s.toCharArray();
		
		String s3 = s.concat(s2);
		System.out.println(s3);
		
		s3 = s3.replace('m', 'z');
		System.out.println(s3);
		
		String s4 = s3.substring(0,3);
		System.out.println(s4);
		
		
		String str = "This is an interesting topic";
		String[] ar = str.split(" ", 3); // split into 'n' parts
		
		for(String st : ar)
		{
			System.out.println(st);
		}
		
		
		
		Human a = new Human("a","Kumar");
		Human b = new Human("b","Singh");
		Human c = new Human("c","Kumar");
		
		System.out.println(a.belongToSameFamily(c));
	}

}


class Human {
	
	private String name;
	private String surName;
	
	public Human(String name, String surName) {
		setName(name);
		setSurname(surName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surName;
	}

	public void setSurname(String surName) {
		this.surName = surName;
	}
	
	public boolean belongToSameFamily(Human o)
	{
		return this.surName.equals(o.surName);
	}
	
}

