package com.udemy.exceptions;

public class FinallyDemoTwo {

	public static void main(String[] args) {
		
		try {
			
			int [] a = new int[3];
			
			System.out.println(a[3]);
			
		} catch (ArrayIndexOutOfBoundsException aie) {
			// TODO: handle exception
			System.out.println(aie);
			System.out.println("Out Of Range");
		}
		finally {
			System.out.println("Out Of Block");
		}
	}
}
