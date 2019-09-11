package com.lec.java.variables01;
/*
	변수 (Variables) :
		값을 담는 공간.  변수이름(variable name)을 부여해서 관리
		
	변수는 사용하기 전에 먼저 '선언(declaration)' 해야 한다
	변수 선언:
		변수타입 변수이름;
	
	변수의 초기화 (initialization)
	변수에 최초로 값(value) 을 대입 (assignment) 하는 것.
	변수(지역변수)를 사용/참조하려면 그전에 반드시 초기화가 되어야 함.

*/

public class Variable01Main {
	public static void main(String[] args) {
		System.out.println("변수(Variables) 01");
		
		// 변수 선언
		// 변수타입 변수이름;
		int num1;  // int 타입의 변수 num1 선언
		int num2;  // int 타입은 대표적인 '정수'타입  (int : integer)
		
		// 변수의 초기화,  변수에 처음으로 값을 저장(대입: assign)
		num1 = 20;   // = : 대입연산자 (assignment operator)
					// 20 이라는 정수값을 변수 num1 에 대입
		num2 = 30;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		//num3 = 30;  // 변수는 사용하기전에 반드시 선언해야 한다.
						// 에러메세지 : cannot be resolved...
		
		// 변수는 대소문자 구분합니다!!!!!
		int Num1 = 100;  // num1 과는 다르다! 
		//int num1;  // 동일한 이름의 변수 선언 불가!
		
		// 변수명 작명
		int abc123 = 1000;  // 숫자, 알파벳 사용 가능
		//int 123abc = 2000;  // 숫자로는 시작 불가
		int _abc_def_ = 3000;   // _ 사용 가능
		int $hello;    // $ 사용 가능
		
		
		
		
		
		
		
	} // end main()
} // end class
















