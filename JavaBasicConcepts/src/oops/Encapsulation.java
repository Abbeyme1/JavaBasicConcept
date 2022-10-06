package oops;

public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area area = new Area();
		area.setBreadth(8);
		area.setLength(7);
		
		area.getArea();
		
		System.out.println(area.getLength());
		
		
	}

}

// calculate area

class Area {
	
	private int length, breadth;
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}
	
	public int getBreadth()
	{
		return breadth;
	}
	
	
	
	public void getArea()
	{
		int area = length * breadth;
		System.out.println("Area = " + area);
	}
}

