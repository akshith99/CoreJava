package com.udemy.recursion;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(sum(5)); 

		System.out.println("The factorial is " + factorial(5));
		
		System.out.println("This is factorial using recursion " + factorialRecursion(5));
		
		
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(fibonacciSeries(n1, n2));
		
		
		System.out.println("This series is " + fibonacciSeriesRecurssion(7));
		
		 reverseNumber(123);
		 System.out.println("The GCD is " + gcd(24, 18));
		
	}
	
	
	public static int sum(int n) {

		if(n == 0) return n;
		
		return n + sum(n-1);

	}
	
	//This without using recursion
	public static int factorial(int n) {
		int temp = 0;
		for(int i = n-1; i>0; i--) {
			temp = n*i;
			n = temp;
		}
		return temp;
	}
	
	public static int factorialRecursion(int n) {
		
		if(n == 0) return 1;
		
		return n * factorialRecursion(n-1);
	}
	
	//This is some stupid solution by me
	public static int fibonacciSeries(int n1, int n2) {
		int n3 = n1 + n2;
		if(n3 > 13) return n3;
		
		n1 = n2;
		n2 = n3;
		System.out.println(n3);
		return  fibonacciSeries(n1, n2);
	}
	
	public static int fibonacciSeriesRecurssion(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibonacciSeriesRecurssion(n-1) + fibonacciSeriesRecurssion(n-2);
	}
	
	public static void reverseNumber(int n) {
		if(n ==0 ) return;
		System.out.println(n%10);
		reverseNumber(n/10);
	}
	
	//Greatest common divisor
	public static int gcd(int num1, int num2) {
		if(num2 != 0)
			return gcd(num2, num1%num2);
		
		return num1;
	}
	
	
	
}
