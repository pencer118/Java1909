package com.lec.java.switch05;

public class Switch05Main {

	// enum 타입 정의하는 방법:
	// enum 이름 {}
	// enum 타입 정의 메소드 안에서는 할 수 없다.

	enum Days {SUN, MON, TUE, WED, THU, FRI, SAT}
	enum Numbers {ONE, TWO, THREE}
	enum Subjects {KOREAN, MATH, ENGLISH}
	
	
	public static void main(String[] args) {
		System.out.println("enum 타입을 switch에서 사용하기");
		
		Days day1 = Days.THU;
		System.out.println(day1);
		Days day2 = Days.MON;
		Numbers num1 = Numbers.ONE;
		Numbers num2 = Numbers.TWO;
		
		switch(day1) {
		case SUN:
			System.out.println("일요일");
			break;
		case MON:
			System.out.println("월요일");
			break;
		case THU:
			System.out.println("목요일");
			break;
		}
		
		
		
		
	} // end main()

} // end class Switch05Main









