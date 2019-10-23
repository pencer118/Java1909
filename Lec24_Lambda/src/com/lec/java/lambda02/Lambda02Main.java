package com.lec.java.lambda02;

/*
	람다 표현식 (lambda - expression): 
	 	() -> 수행코드
	 	() -> 리턴값
	 	(매개변수..) -> 수행코드
	 	(매개변수..) -> 리턴값
	 	
	 매개변수의 타입은 생략해서 표현이 가능
	 매개변수가 여러개 있을 경우,
		 모든 매개변수의 타입을 생략해서 표현하거나,
		 모든 매개변수의 타입을 모두 다 표현해야 함. 
*/
public class Lambda02Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
		Test01 lambda01 = () -> System.out.println("안녕하세요");
		lambda01.testPrint();
		
		Test02 lambda02 = (x) -> System.out.println("num = " + x);
		lambda02.testPrint(100);
		
		Test03 lambda03 = (x, y) -> (x > y) ? x : y ;
		System.out.println(lambda03.max(400, 401));
		
		
		
		
	} // end main()

} // end class Lambda02Main

















