package oops;

public class DefaultInitialisationOfInstanceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair p = new Pair();
		System.out.println(p.i + " "+ p.f + " "+ p.b + " " + p.s + " " + p.c + " " + p.a);
		
		
	}

}

class Pair {
	int i;
	float f;
	boolean b;
	String s;
	char c;
	int[] a;
}

