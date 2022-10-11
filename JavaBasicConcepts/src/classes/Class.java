package classes;

import java.util.ArrayList;

public class Class {


	static ArrayList<Student> students;

	
	public static void main(String[] args) {
		
		students = new ArrayList<>();
		addStudent("abhay", 22);
		addStudent("abhay", 23);
		
		System.out.println(students.get(1).toString());
		
//		students.get(1).age = 5; ///
		
//		Student.rollNumberCounter = 5;
		
	}
	
	public static void addStudent(String name, int age)
	{
		Student s = new Student(name,age);
		
		students.add(s);
		
		
		
	}

}

class Student {
	
	private static String collegeName = "ABC University";
	private static String collegeAddress = "78, abcd mnop";
	private static int rollNumberCounter = 1;
	
	private String name;
	private int age, rollNumber;
	
	public Student(String name, int age)
	{
		setName(name);
		setAge(age);
		setRollNumber(rollNumberCounter++);
	}
	

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public String getCollegeName()
	{
		return collegeName;
	}
	
	public String getCollegeAddress()
	{
		return collegeAddress;
	}
	
	public String toString()
	{
		return "name: " +  getName() + ", age: "+ getAge() + ", rollNumber: "+ getRollNumber() + ", collegeName: "+ collegeName + ", collegeAddress: "+ collegeAddress;
	}
}
