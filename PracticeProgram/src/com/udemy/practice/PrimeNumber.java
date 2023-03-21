package com.udemy.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 11;
		int i;
		boolean isPrime = true;
		
		
		for(i = 2; i < num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(num + " is prime");
		}else {
			System.out.println(num + " is not prime");
		}
		
	}

}
