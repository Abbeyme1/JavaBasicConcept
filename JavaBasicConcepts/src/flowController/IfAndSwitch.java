package flowController;

public class IfAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		
		if(age >= 18) System.out.println("elidgible to code");
		else System.out.println("not elidgible");
		
		
		int m = 3;
		String month;
		
		switch(m)
		{
		case 1 : month = "Jan"; break;
		case 2 : month = "Feb"; break;
		case 3 : month = "Mar"; break;
		case 4 : month = "Apr"; break;
		default: month = null;
		}
		
		System.out.println(month);

	}

}
