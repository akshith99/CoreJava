package com.udemy.oops;

public class Animal {

	void eat() {
		System.out.println("I am eating");
	}
	
}

class BabyAnimal extends Animal {
	
	void sleep() {
		System.out.println("I am sleeping");
	}
	
}

class ManinMethod {
	
	public static void main(String[] args) {
			
			BabyAnimal baby = new BabyAnimal();
			baby.eat();
			baby.sleep();
			
		}
}
