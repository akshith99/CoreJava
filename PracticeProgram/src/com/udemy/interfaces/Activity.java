package com.udemy.interfaces;

interface Activity {

	void eat();
	void sleep();
	
}

interface Joy extends Activity {
	
	void play();
	void coding();
	
}

interface Sam extends Joy {
	
	void smoke();
}

class MyClass implements Joy {

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping...");
	}

	@Override
	public void play() {
		System.out.println("Playing...");
	}

	@Override
	public void coding() {
		System.out.println("Coding...");
	}
	
}

class MainMethodThree {
	
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
		obj.eat();
		obj.sleep();
		obj.play();
		obj.coding();
	}
}
