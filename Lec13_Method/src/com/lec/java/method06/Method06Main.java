package com.lec.java.method06;

import java.util.Scanner;

/* Method Overloading (메소드 중복 정의)
	 '같은 이름으로 메소드'를 매개변수 리스트를 달리하여 '중복' 정의, 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 

 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		sayHello();
		sayHello("가나다");
		sayHello(20);
		
		//sayHello(3.14);  // sayHello(double)
		//sayHello(1, 2, 3);  // sayHello(int, int, int)
		
		short s = 100;
		sayHello(s);  // sayHello(short)
		
		byte b = 10;
		sayHello(b);  // <-- 어떤 sayHello???
		
		// 메소드 오버로딩의 장점??
		// 동작은 동일하나 매개변수의 타입이 다른 경우.
		// 일일히 메소드의 이름을 따로 정의하고 숙지 안해도 된다.
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("hello");
		
		
		// 타입별로 메소드 만들면 사용하기 불편 
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		sc.nextByte();
//		sc.nextLong();
		
		
		
		
	} // end main()
	
	// 1.
	public static void sayHello() {  // signature --> sayHello()
		System.out.println("sayHello() 호출");
		System.out.println("안녕하세요~");
	}
	
	// 리턴 타입 다르다고 오버로딩 인정되지 않는다
//	public static int sayHello() {
//		
//	}
	
	
	// 2.
	public static void sayHello(String name) { // signature --> sayHello(String) 
		System.out.println("sayhello(String) 호출");
		System.out.println("Hi ~ ");
		System.out.println("제 이름은 " + name + " 입니다");
	}
	
	// 3-1
	public static void sayHello(int age) {  // sayHello(int)
		System.out.println("sayHello(int) 호출");
		System.out.println("My age is " + age);
	}
	
	// 3-2
	public static void sayHello(short age) {
		System.out.println("sayHello(short) 호출");
		System.out.println("My age is " + age);
	}
	
	
	// 4
	public static void sayHello(String name, int age) {
		System.out.println("sayHello(String, int) 호출");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	// 5
	public static void sayHello(int age, String name) {
		System.out.println("sayHello(int, String) 호출");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	
	
	
	
	
} // end class Method06Main









