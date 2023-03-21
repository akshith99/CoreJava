package com.udemy.interfaces;

public interface Example {

	void connect();
	
	void disconnect();
	
}

class Oracle implements Example {
	
	public void connect( ) {
		System.out.println("Connected to oracle database");
	}
	
	public void disconnect() {
		System.out.println("Disconnected from oracle database");
	}
}

class MainMethodTwo {
	
	public static void main(String[] args) {
		
		Oracle o = new Oracle();
		
		o.connect();
		o.disconnect();
	}
}
