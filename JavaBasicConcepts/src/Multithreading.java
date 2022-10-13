
public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "jkjsdf";
		
		
		
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("start");
		
		Hi a = new Hi(sb);
		Hello b = new Hello(sb );
		
		
		new Thread(a).start();
		new Thread(b).start();
//		a.start();
//		b.start();
//		
//		System.out.println(sb.toString());

	}

}


class Hi implements Runnable{
	
	public Hi(StringBuffer sb)
	{
		System.out.println(sb.length());
	}
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}


class Hello implements Runnable{
	
	public Hello(StringBuffer sb)
	{
		System.out.println(sb.length());
	}
	
	public void run() {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
