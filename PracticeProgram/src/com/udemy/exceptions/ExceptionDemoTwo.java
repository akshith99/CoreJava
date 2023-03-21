package com.udemy.exceptions;

import java.util.HashSet;
import java.util.Set;

public class ExceptionDemoTwo {

	public static void ArrayOutOfBound() {
		
		int[] a = new int[2];
		
		System.out.println(a[3]);
	}
	
	
	public static void NullPointerException() {
		String myStr = null;
		
		System.out.println(myStr.length());
	}
	
	public static void NoSuchElement() {
		
		Set<Integer> hashset = new HashSet<Integer>();
		
		hashset.iterator().next();
		
	}
	
	public static void StringOutOfBound() {
			
			String str = "Example";
			
			System.out.println(str.charAt(10));
		}
	
	//Some built in exceptions are as follows: 
	// 1. Arithmetic exceptions
	// 2. ArryIndexOutOfBoundsException
	// 3. ClassNotFoundException
	// 4. FileNotFoundException
	// 5. I/O Exception
	// 6. Interrupted Exception
	// 7. NoSuchFieldException
	// 8. NoSuchMethodException
	// 9. NullPointerException
	// 10. NumberFormatException
	// 11. RunTimeException
	// 12. StringIndexOutOfBound
	// 13. 
	
	
	public static void main(String[] args) {
		
		try {
			ArrayOutOfBound();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			NullPointerException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			NoSuchElement();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			StringOutOfBound();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
