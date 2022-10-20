package exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

public class Serialization {

	
	public static <T> void serialize(T obj,String fileName)
	{
		try {
			
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
		
			out.writeObject(obj);
			file.close();
			
			System.out.println("Object Serialized");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static <T> T deserialize(String fileName)
	{
		T n = null;
		try {
			
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			
			n = (T) in.readObject();
			
			System.out.println((T)(n));
			
			in.close();
			file.close();
			
			System.out.println("Deserialized");
			
		}
		catch(IOException e) {System.out.println(e); }
		catch(ClassNotFoundException e) {System.out.println(e); };
		
		return n;
	}
	
	
	public static void main(String[] args) {
		
		String fileName = java.time.LocalDate.now() +"-" +".tmp";
		
//		Player a = new Player("abcd");
//		a.kills = 5;
//		System.out.println(a.toString());
//		
//		serialize(a,fileName);
//		
//		Player n = deserialize(fileName);
//		
//		
//		System.out.println(n.toString());
		
		
		// Child 
		
//		Sniper a = new Sniper("abcd");
//		a.kills = 5;
//		System.out.println(a.toString());

//		serialize(a,fileName);
//		
//		Sniper n = (Sniper) deserialize(fileName);
//		
//		
//		System.out.println(n.toString());
		
		
		
		
		
		
		
	}

}





class Player implements Serializable{
	
	static int c = 2;
	String name;
	int kills;
	int points;
	transient int health;
	
	
	public Player(String name)
	{
		this.name = name;
		health = 90;
	}
	
	public String toString()
	{
		return "name: " +  name + ", kills: "+ kills + ", health: "+ health;
	}
}

class Sniper extends Player {

	public Sniper(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}