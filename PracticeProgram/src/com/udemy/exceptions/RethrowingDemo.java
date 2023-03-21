package com.udemy.exceptions;

public class RethrowingDemo {

	 void method1() {
		
		try {
			
			String str = "Hello";
			
			char ch = str.charAt(5);
			
			System.out.println(ch);
		} catch (StringIndexOutOfBoundsException sie) {
			// TODO: handle exception
			System.out.println("Please see the index is within the range");
			throw sie;
		}
	}
	
}

class B {
	
	public static void main(String[] args) {
		
		RethrowingDemo a = new RethrowingDemo();
		
		try {
			
			a.method1();
			
		} catch (StringIndexOutOfBoundsException sie) {
			// TODO: handle exception
			System.out.println("Caught rethrown exception");
		}
	}
}