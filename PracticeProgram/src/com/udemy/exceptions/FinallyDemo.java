package com.udemy.exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Open Files");
			int n = args.length;
			System.out.println("n = " + n);
			int a = 45/n;
			System.out.println("a = " + a);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(ae);
			System.out.println("Please pass the data correctly");
		}
		finally {
			System.out.println("Close Files");
		}
	}
}
