package oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trek trek = new Trek(50, 5, 1, "red");
		
		
		System.out.println(trek.getColor());
		
		
		Audi audi = new Audi(1800,"black");
		
		audi.start();
		
		

	}

}


class Bike {
	
	private int speed,gear;
	
	public Bike(int speed, int gear)
	{
		this.setSpeed(speed);
		this.setGear(gear);
	}
	
	
	public void increaseSpeed(int inc)
	{
		setSpeed(getSpeed() + inc);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}
}

class MountainBike extends Bike {
	
	private int seats;
	
	public MountainBike(int speed,int gear,int seats)
	{
		super(speed,gear);
		this.setSeats(seats);
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}

class Trek extends MountainBike {
	
	private String color;
	
	public Trek(int speed,int gear,int seats,String color)
	{
		super(speed,gear,seats);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}




// hybrid
interface A {
	
	public void a();
}

interface B extends A{
	public void b();
}


interface C extends A {
	public void c();
	
}

interface D extends B,C {
	
}








// has-a
class Car {
	int speed;
	String color;
	
	public Car(int speed,String color)
	{
		this.speed = speed;
		this.color = color;
	}
}


class Audi extends Car {
	
	public Audi(int speed,String color)
	{
		super(speed,color);
	}
	
	public void start() {
		
		Engine engine = new Engine();
		engine.start();
		
	}
}


class Engine {
	
	public void start() {
		System.out.println("started...");
	}
	
	public void stop() {
		System.out.println("stopped");
	}
}

