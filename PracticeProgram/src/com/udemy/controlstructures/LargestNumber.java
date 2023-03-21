package com.udemy.controlstructures;

import java.util.Scanner;

public class LargestNumber {
	
	public static void displayLargeNumber(int num1, int num2, int num3) {
		
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest number is : " + num1);
		} else if (num2>num1 && num2>num3) {
			System.out.println("The greatest number is : " + num2);
		} else {
			System.out.println("The greatest number is : " + num3);
		}
		
	}

	public static void main(String[] args) {
		
		int num1, num2 , num3;
		
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		num1 = input.nextInt();
		System.out.println("Enter the second number ");
		num2 = input.nextInt();
		System.out.println("Enter the third number ");
		num3 = input.nextInt();
		
		displayLargeNumber(num1, num2, num3);
		
		input.close();
	}
}
