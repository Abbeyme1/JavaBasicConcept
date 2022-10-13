package athlete;

import java.util.Scanner;

import org.junit.Test;


public class Create {

	@Test
	public void a()
	{
		System.out.println("yes");
		
	}
	
	
	public static void createAthlete() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		
		
		int option = 0;
		
		System.out.print("Enter 1 for runner or 2 for swimmer: ");
		
		
		option = sc.nextInt();
		
		
		AbstractAthlete athlete = null;
		
		
		Runner runner = null;
		Swimmer swimmer = null;
		
		
		switch(option)
		{
		case 1:  {
			
			athlete = new Runner(name); 
			
			
			System.out.println("Runner created");  
			break; 
			}
		
		case 2:  {
			athlete = new Swimmer(name); 
			System.out.println("Swimmer created");
			break; 
			}
		
		default: {
			
			System.out.println("Invalid input");
			}
		}
		
	
		
//		athlete.printInfo();
//		athlete.walk();
//		athlete.longJump();
		
		((Runner) athlete).runnerRuns();
		
		
//		Runner r = new athlete();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createAthlete();

	}

}
