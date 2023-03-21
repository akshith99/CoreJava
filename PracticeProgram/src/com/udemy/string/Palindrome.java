package com.udemy.string;

import java.util.Scanner;

public class Palindrome {

	
	public static void isPalindrome(String str) {
		
		String rev = "";
		
		for(int i = str.length()-1;  i>=0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println("The reverse is " + rev);
		
		if(rev.equals(str)) {
			System.out.println("The entered string is a palindrome");
		}else {
			System.out.println("The entered string is not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.next();
		String str = word.toLowerCase();
		isPalindrome(str);
		input.close();
	}
}
