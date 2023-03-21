package com.udemy.string;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = input.nextLine();
		String str = word.toLowerCase().trim().replace(" ", "");
		System.out.println(str);
		int vowelCount = 0, consonantCount = 0;
		
		
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelCount++;
			} else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				consonantCount++;
			}
		}
		
		System.out.println("The number of vowels is " + vowelCount);
		System.out.println("The number of consonants is " + consonantCount);
		input.close();
	}
}
