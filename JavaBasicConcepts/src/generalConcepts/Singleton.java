package generalConcepts;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Config a = Config.getInstance();
		
		Config b = Config.getInstance();
		
		
	
		

	}

}


class Config {
	
	private static Config c = null;
	
	private Config()
	{
		
	}
	
	
	public static Config getInstance()
	{
		if(c == null) c = new Config();
		return c;
	}
}


class A {
	
	private A() {
		
	}
}
final class K {
	
	
}


class B extends K {
	
}