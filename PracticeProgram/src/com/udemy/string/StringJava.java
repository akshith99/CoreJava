package com.udemy.string;

public class StringJava {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		//append method
		sb.append("World");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Intelligent Person");
		//insert method
		sb2.insert(11, " Young");
		System.out.println(sb2);
		//delete method
		sb2.delete(11, 17);
		System.out.println(sb2);
		//replace method
		sb2.replace(0, 11, "Smart");
		System.out.println(sb2);
		//reverse method
		sb2.reverse();
		System.out.println(sb2);
		//length method
		int length = sb2.length();
		System.out.println(length);
		//to String
		String word = sb.toString();
		System.out.println(word);
		//index of
		System.out.println(sb.indexOf("d"));
		System.out.println(sb.lastIndexOf("l"));
		//charAt method
		String a = "Hello Akshith";
		char ch;
		ch = a.charAt(4);
		System.out.println("The character is " + ch);
		
		//compareTo & compareToIgnoreCase method
		//if one == two it will return 0
		//if one > two it will return +ve value;
		//if two > one it will return -ve value;
		String one ="boy", two = "Box";
		int b;
		b = one.compareTo(two);
		System.out.println(b);
		int c;
		c = one.compareToIgnoreCase(two);
		System.out.println(c);
		
		//concatenate method
		String str1 = "Hello";
		String str2 = "Dude";
		
		String str3;
		str3 = str1.concat(str2);
		System.out.println(str3);
		
		int num = 2;
		String str4 = "Whatsup";
		String result;
		result  = str1.concat(str2);
		result += str4;
		result += num;
		System.out.println(result);
		
		//equals method
		String name1 = "akshith";
		String name2 = "Akshith";
		String name3 = "Manish";
		boolean check =  name1.equals(name2);
		boolean check2 = name1.equalsIgnoreCase(name2);
		System.out.println(check);
		System.out.println(check2);
		System.out.println("manish".equalsIgnoreCase(name3));
		
		//getChars method
		String hero = "Batman";
		char[] arr = new char[20];
		
		hero.getChars(3, 6, arr, 0);
		System.out.println(arr);
		
		//length method
		String example = "Lionel Messi";
		int len = example.length();
		System.out.println(len);
		
		//replace method
		String replaced =  example.replace("Lionel", "Encara");
		System.out.println(replaced);
		
		//split method
		String str = "This is a java program";
		String [] split;
		split = str.split(" ");
		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		//string comparison
		String text = "Hello";
		String text2 = "Hello";
		String text3 = new String("Hello");
		//you cannot compare string using "==" because it will give
		//wrong result some times
		if(text == text2) {
			System.out.println("Both Strings are same");
		} else {
			System.out.println("Both Strings are not same");
		}
		if(text2 == text3) {
			System.out.println("Both Strings are same");
		} else {
			System.out.println("Both Strings are not same");
		}
		//you should compare strings like this to get the correct results
		if(text.equals(text2)) {
			System.out.println("Both Strings are same");
		} else {
			System.out.println("Both Strings are not same");
		}
		
		//subString method & toLowecase, toUppercase method
		String subWord = "television";
		String subWord2 = "TeleVision";
		String subs = subWord.substring(4);
		String subs2 = subWord.substring(2, 5);
		String lower = subWord2.toLowerCase();
		String upper = subWord.toUpperCase();
		System.out.println("Substring method: " + subs);
		System.out.println(subs2);
		System.out.println(lower);
		System.out.println(upper);
		
		//trim method
		String trimWord = "     Hello world     ";
		String newWord =  trimWord.trim();
		System.out.println("Trimmed word is " + newWord);
	}
}
