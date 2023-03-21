package com.udemy.practice;

import java.util.Scanner;

public class TemperatureCoversion {

	public static void main(String[] args) {
		
		double temperature;
		
		try(Scanner input = new Scanner(System.in)){
		
		System.out.println("Enter the temperature in celsius : ");
		
		temperature = input.nextDouble();
		temperature = (temperature*9/5.0) + 32;
		
		System.out.println("The temperature in fahrenheit is :" + temperature);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
