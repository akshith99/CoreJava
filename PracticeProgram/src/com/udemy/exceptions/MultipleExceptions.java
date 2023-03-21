package com.udemy.exceptions;

public class MultipleExceptions {

	
	public static void main(String[] args) {
		
		try {
			System.out.println("Open Files");
			
			int n = args.length;
			System.out.println("n = " + n);;
			
			int a = 45/n;
			System.out.println("a = " + a);
			
			int[] b = {10,20,30};
			
			System.out.println(b[40]);
			
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Pass Correct Data");
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("Array Index is out of range");
		} finally {
			System.out.println("Close Files");
		}
		
	}
}
