package com.udemy.oops;

public class Overriding {

	
	void display() {
		System.out.println("I am parent class");
	}
	
}

class OverrideMain extends Overriding {
	
	
	void display() {
		System.out.println("I am child class");
	}
	
	public static void main(String[] args) {
		
		Overriding parent =  new Overriding();
		
		parent.display();
		
		OverrideMain child = new OverrideMain();
		
		child.display();
	}
}
