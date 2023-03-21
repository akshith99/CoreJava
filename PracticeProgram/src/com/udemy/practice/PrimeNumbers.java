package com.udemy.practice;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int isPrime, num,j;
		
		for(num = 1; num<= 100; num++) {
			 isPrime = 0;
			for(j = 2; j<= num/2; j++) {
				
				if(num % j == 0) {
					isPrime = 1;
					break;
				} 
			}
			
			if(isPrime == 0) {
				System.out.println(num + " is prime");
			}
		}

	}

}
