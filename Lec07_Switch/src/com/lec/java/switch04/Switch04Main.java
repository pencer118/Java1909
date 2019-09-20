package com.lec.java.switch04;

public class Switch04Main {

	public static void main(String[] args) {
		System.out.println("String 타입을 switch에서 사용하기");
		
		String language = "C++";
		switch(language) {
		case "Java":
			System.out.println("Hello Java!");
			break;
		case "C++":
			System.out.println("Hello C++");
			break;
		case "Kotlin":
			System.out.println("Hello Kotlin");
			break;
		default:
			System.out.println("그 밖의 언어들");
		}

	} // end main()

} // end Switch04Main





















