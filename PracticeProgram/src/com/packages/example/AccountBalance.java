package com.packages.example;

public class AccountBalance {

	
	public static void main(String[] args) {
		
		Balance current[] = new Balance[3];
		
		current[0] = new Balance("Ram", 99999.99);
		current[1] = new Balance("Lakshman", 88888.88);
		current[2] = new Balance("Hanuma", 77777.77);
		
		for(int i = 0; i< current.length; i++) {
			current[i].show();
		}
	}
}
