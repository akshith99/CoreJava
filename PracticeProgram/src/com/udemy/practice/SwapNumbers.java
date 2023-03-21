package com.udemy.practice;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int first = 10;
		int second = 25;
		
		System.out.println("Before Swap");
		System.out.println("The first number is : " + first);
		System.out.println("The second nunber is :" + second);
		
		int temp = first;
		
		first = second;
		second = temp;
		
		System.out.println("After Swap");
		System.out.println("The first number is :" + first);
		System.out.println("The second number is :" +second);
		
	}
}
