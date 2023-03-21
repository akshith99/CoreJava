package com.udemy.controlstructures;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int n, sum = 0, r, temp;
			
			System.out.println("Enter the number : ");
			n = input.nextInt();
			
			temp = n;
			
			while(n!=0) {
				
				r = n%10;
				sum = (sum*10)+r;
				n = n/10;
			}
			System.out.println("The reverse of the number is : " + sum);
			if(sum == temp) {
				System.out.println("The entered number is palindrome ");
			} else {
				System.out.println("The entered number is not a palindrome ");
			}
			input.close();
		
	}
}
