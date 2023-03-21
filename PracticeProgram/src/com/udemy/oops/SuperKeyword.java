package com.udemy.oops;


	class One {
		
		int i = 10;

//		One() {
//		System.out.println("One");
//	}
		
		void show() {
			System.out.println("Super class i: " + i);
		}
		

		
	}
	
	class Two extends One {
		
		int i = 20;
	
//		Two() {
// 			System.out.println("Two");
//		}
		
		public Two(int i) {
			this.i = i;
		}
	
		public Two() {
			
		}
	
		//The super keyword refers to the parent class methods and variables
		void show() {
			System.out.println("Sub class i: " + i);
			super.show();
		}
	}
	
	public class SuperKeyword {
	
		public static void main(String[] args) {
			
			Two obj =  new Two();
			obj.show();
			
		}
		
	}
