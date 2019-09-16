package com.lec.java.variables05;

public class Variable05Main {

	public static void main(String[] args) {
		System.out.println("변수 : char, boolean");

		// char : '문자 하나'를 저장하기 자료 타입 (2byte)
		char ch1 = 'A';
		// 문자열은 " ~ " 쌍따옴표로 묶어줌   --> String literal
		// 문자하나(char) 는 ' ~ ' 홀따옴표로 묶어줌.  --> char literal
		System.out.println("ch1: " + ch1);
		
		//char ch2 = "A";
		
		char ch2 = '한';
		char ch3 = '글';
		System.out.println("ch2:" + ch2);
		System.out.println("ch3:" + ch3);
		
		char ch4 = 0x4D2;   // 16진수 정수 리터럴 숫자앞에 0x 붙이면 됨 
		System.out.println("ch4:" + ch4);
		char ch5 = 1235;
		System.out.println("ch5:" + ch5);
		
		char ch6 = '!';
		System.out.println("ch6:" + ch6);
		char ch7 = 041;   // 정수 앞에 0 을 붙이면 8진수 리터럴
		System.out.println("ch7:" + ch7);
		
		// 코드값을 출력하고 싶으면?
		System.out.println("ch7:" + (int)ch7);
		
		char ch8 = 'A';
		char ch9 = 'a';
		
		System.out.println("ch8:" + (int)ch8);
		System.out.println("ch9:" + (int)ch9);
		
		// cable, bible, able ... >  able, bible, cable
		// 1. AaAa 
		// 2. AAaa 
		// 3. aaAA 
		// 4. aAaA
		// 2->1->4->3
		
		System.out.println();
		// boolean 타입 (논리형): 참 (true)/ 거짓(false)
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		
		boolean b3 = 10 < 20;
		System.out.println("b3: " + b3);
		
		
		// String 타입
		// primitive 타입 아닙니다!
		String name = "홍길동";
		String nick = "의적";
		System.out.println("이름은 : " + name + "\n별명은:" + nick);
		
		
		
	} // end main()

} // end class











