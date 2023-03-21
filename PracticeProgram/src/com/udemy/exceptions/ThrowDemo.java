package com.udemy.exceptions;

public class ThrowDemo {

	static void checkAge(int age) {
		System.out.println(age);
		if(age<18) {
			throw new ArithmeticException("ACCESS DENIED");
		} else {
			System.out.println("ACCESS GRANTED");
		}
	}
	
	static int sum(int num1, int num2) {
		
		if(num1 == 0)
			throw new ArithmeticException("First parameter is not valid");
		else 
			System.out.println("Both the parameters are valid");
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		checkAge(18);
		int result = sum(0, 15);
		System.out.println("The result is : " + result);
	}
}
