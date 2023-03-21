package com.udemy.oops;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class StudentDetails extends Student {

	public StudentDetails(int id, String name) {
		super(id, name);
	}
	
	public static void main(String[] args) {
		
		StudentDetails details = new StudentDetails(10, "Akshith");
		
		System.out.println("The roll number is " + details.getId());
		System.out.println("The name of the student is " + details.getName());
	}
	
}
