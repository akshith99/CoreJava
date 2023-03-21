package com.udemy.exceptions;

public class ClassNotFound {

	void test() {
		System.out.println("testing");
	}
}

class Mammal {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("java.lang.Integer");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
