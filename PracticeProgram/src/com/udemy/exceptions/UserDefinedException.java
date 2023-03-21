package com.udemy.exceptions;

public class UserDefinedException extends Exception {

	private static int [] accno = {1001,1002,1003};
	
	private static String [] name = {"Ram", "Lakshman", "Hanuman"};
	
	private static double [] bal = {9999.99, 8888.88, 7777.77};
	
	 UserDefinedException() {}
	 
	 UserDefinedException(String str) {
		 super(str);
	 }
	 
	 public static void main(String[] args) {
		
		 try {
			for(int i = 0 ; i < 3; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				
				if(bal[i] < 1000) {
					UserDefinedException me = new UserDefinedException("Balance is low");
					throw me;
				}
			}
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}
	}
	 
	 

}
