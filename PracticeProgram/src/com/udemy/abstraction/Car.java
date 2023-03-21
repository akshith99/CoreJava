package com.udemy.abstraction;

public abstract class Car {

	
	void openTank() {
		
		System.out.println("Fill the tank");
		
	}
	
	abstract void steering();
	
	abstract void brakes();
	
}

class Maruthi extends Car {

	@Override
	void steering() {
		
		System.out.println("Ordinary Steering");
		
	}

	@Override
	void brakes() {
		System.out.println("Hydraulic Brakes");
	}
	
}

class Santro extends Car {

	@Override
	void steering() {
		System.out.println("Power Steering");
	}

	@Override
	void brakes() {

		System.out.println("Gas Brakes");
	}
	
}

class Commonclass {
	
	public static void main(String[] args) {
		
		Maruthi m =  new Maruthi();
		Santro s = new Santro();
		
		Car ref;
		ref = m;
		
		Car ref2;
		ref2 = s;
		
		ref.openTank();
		ref.steering();
		ref.brakes();
		
		ref2.steering();
		ref2.brakes();

		
	}
}