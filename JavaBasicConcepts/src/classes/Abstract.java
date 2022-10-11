package classes;

import java.util.Scanner;

import athlete.Human;

public class Abstract {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}






abstract class A {

	static int m;
	
	protected void a() {
		
	}
	
	abstract void ab();
}

abstract class C extends A
{
	protected void d() {
		a();
	}
	abstract protected void c();
	
	
}

class d extends C {

	protected void m() {
		a();
		d();
	}
	
	@Override
	protected void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void ab() {
		// TODO Auto-generated method stub
		
	}
	
}
