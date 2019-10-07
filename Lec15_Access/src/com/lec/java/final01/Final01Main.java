package com.lec.java.final01;

public class Final01Main {
	
	// final 멤버변수
	// (주의) final 멤버 변수는 반드시 선언과 동시에 초기화해야 함
	final int NUM = 1;  // 일반적으로 final 은 대문자로 작명함
	// final int NUM2;  // 에러
	
	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		
		int num1 = 1;
		num1 = 10;  // 변수(Variable)는 값 변경 가능!
		
		final int num2 = 1;  // final 이 변수에 붙으면 최초 값 대입(초기화)후 변경 불가.
		//num2 = 10;   // 상수(Constant) 라고도 함. 
		
		final int num3;
		num3 = 10;  // 초기화
		//num3 = 20;  // 초기화 이후 변경 불가
		
		//NUM = 10;

	} // end main()

} // end class Final01Main










