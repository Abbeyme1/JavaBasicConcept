package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 {

	public static void main(String[] args) {
		
		String fileName = java.time.LocalDate.now() +"-" +".tmp";
		
		PlayerBots a = new PlayerBots("abc");
		a.health = 5;
		System.out.println(a.toString());
		
		try {
			
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			out.writeObject(a);
			file.close();
			
			System.out.println("Object Serialized");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		
		PlayerBots n = null;
		try {
			
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			
//			System.out.println("Abc " + in.readObject());
			n = (PlayerBots) in.readObject();
			
			
			in.close();
			file.close();
			
			System.out.println("Deserialized");
			
		}
		catch(IOException e) {System.out.println(e); }
		catch(ClassNotFoundException e) {System.out.println(e); };
		
		
		System.out.println(n.toString());
	}

}


class Bots {
	
	String name;
	int health;
	
	public Bots()
	{
		this.name = "abc";
		
	}
	public String toString()
	{
		return "name: " +  name + ", health: "+ health ;
	}
}

class PlayerBots extends Bots implements Serializable {
	
	int kills;
	
	public PlayerBots(String name) {
		
		
		this.name = name;
	}
	
}



