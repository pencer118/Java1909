package com.lec.java.operator05;

/*
	관계(비교) 연산자   Equality and Relational Operators
	
	 비교 연산의 결과를 참(true) 또는 거짓(false)으로 리턴하는 연산자
	 A < B: A는 B보다 작다
	 A > B: A는 B보다 크다
	 A >= B: A는 B보다 크거나 같다
	 A <= B: A는 B보다 작거나 같다
	 A == B: A와 B가 같다.
	 A != B: A와 B는 다르다.	
 */
public class Operator05Main {

	public static void main(String[] args) {
		System.out.println("연산자 5 - 관계(비교) 연산자   Equality and Relational Operators");
		System.out.println("<, >, <=, >=, ==, !=");
		
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		System.out.println(20 > 20);
		System.out.println(20 >= 20);  // true,   =>  (x)
		
		double d1 = 3.2;
		double d2 = 3.2;
		
		System.out.println(d1 == d2);  // ==  와 = 헷갈리지 말기.!!!
		
		// 실수 연산 결과 비교 주의! .. 정밀도의 문제 발생
		double d3 = 12.3 / 4.1 + 0.2;  // 3.2
		
		System.out.println(d1 == d3);
		
		System.out.println(d1 != d3);
		
		

		
	} // end main()
} // end class Operator5Main






