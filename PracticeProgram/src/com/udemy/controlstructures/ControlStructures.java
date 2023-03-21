package com.udemy.controlstructures;

public class ControlStructures {

	public static void main(String[] args) {
		
		int num = 101;
		
		int digit = 123;
		
		int day = 3;
		
		int[] arr = {2,11,45,9};
		
		int j = 0;
		
		//if statement
		if(num < 70) {
			System.out.println("The number us less than 70");
		}
		
		//if else statement
		if(num < 70) {
			
			System.out.println("Number is less than 70");
		} else {
			System.out.println("The number is greater than 70");
		}
		
		//Nested if satatement
		if(num > 100) {
			System.out.println("Hey The number is greater than 100");
			if(num <100) {
				System.out.println("Hey The number is less than 100");
			}
		}
		
		//else if ladder
		if(digit < 100 && digit > 9) {
			System.out.println("It is a two digit number");
		} else if (digit < 1000 && digit > 99) {
			System.out.println("It is a three digit number");
		} else if (digit < 10000 && digit > 999) {
			System.out.println("It is a four digit number");
		} else {
			System.out.println("The number is out of range");
		}
		
		//Switch statement
		switch (day) {
		case 1: 
			System.out.println("Today is monday");
			break;
		case 2: 
			System.out.println("Today is tuesday");
			break;
		case 3: 
			System.out.println("Today is wednesday");
			break;
		case 4: 
			System.out.println("Today is thursday");
			break;
		default:
			System.out.println("Oops I don't know what day it is today");
		}
		
		//For loop
		for(int i = 0; i<=10; i++) {
			System.out.println("The value of i is: "+ i);
		}
		for(int i = 10; i>=0; i--) {
			System.out.println("The value of i is: " + i);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//While loop
		while (j < arr.length) {
			System.out.println("This my boy is using a while loop " + arr[j]);
			j++;
		}
		
		//do while loop
		int k = 10;
		do {
			System.out.println("This one is using the do while loop " + k);
			k--;
		} while (k>=1);		
		
	}
}
