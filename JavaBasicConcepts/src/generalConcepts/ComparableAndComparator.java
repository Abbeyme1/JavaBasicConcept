package generalConcepts;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ComparableAndComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student a = new Student("a",2);
		Student b = new Student("b",3);
		Student c = new Student("c",1);
		
		List<Student> l = new ArrayList<>();
		l.add(a);
		l.add(b);
		l.add(c);
		
		Collections.sort(l);
		
		Collections.sort(l, new compareName());
		Collections.sort(l, new compareAge().reversed());
		
		System.out.println(l);
		
		

	}

}



class Student implements Comparable<Student>{
	
	String name;
	int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +", age="+age;
	}
}


class compareAge implements Comparator<Student> {
	
	public int compare(Student a, Student b) {
		return a.age - b.age;
	}
}

class compareName implements Comparator<Student> {
	
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}