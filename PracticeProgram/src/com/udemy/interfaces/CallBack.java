package com.udemy.interfaces;

public interface CallBack {

	void callBack(int param);
	
}

class Client implements CallBack {

	@Override
	public void callBack(int param) {
		System.out.println("Callback called with : " + param);
	}
	
}

class MainClass {
	
	public static void main(String[] args) {
		
		Client c = new Client();
		
		c.callBack(25);
	}
}