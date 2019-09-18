package com.lec.java.operator01;

/*
 * 연산자 관련 일반사항
 * 
 * 연산 Operation
 * 연산자  Operator
 * 피연산자 Operand
 * 
 * ■ 피연산자의 개수에 따라
 * 이항연산자(binary operator) : 피연산자가 2개인 연산자 
 * 단항연산자(unary operator) : 피연산자가 1개인 연산자
 * 삼항연산자(ternary operator) : 피연산자가 3개인 연산자
 * 
 * ■ 연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시키려 한다.
 * 
 * ■ 피연산자의 타입에 따라 수행하는 연산이 달라지는 연산자들도 있다  (ex: +  )
 * 
 * ■ 모든 연산은 연산의 결과값을 리턴한다 (어떠한 '값'인지?, 어떤 '타입'인지? 주목)
 * 
 * ■ 관례적으로 이항연산자는 피연산자와 연산자 간에 한칸씩(space) 띄어주는게 좋다
 *   단항연산자는 피연산자와 연산자를 붙여주는게 일반.
 */

/*
	대입 연산자 assignment operator : =
 		등호(=) 오른쪽의 값을 왼쪽에 대입(저장)
 		
 	산술 연산자 arithmetic operator : +, -, *, /, % 
 */
public class Operator01Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 01");
		
		System.out.println("\n====================");
		System.out.println("[1] 대입 연산자 : = (assignment operator)");
		int num = 123;   
		
		
		System.out.println("\n====================");
		System.out.println("[2] 산술 연산자: +, -, *, /, % (arithmetic operator)");
		int num1 = 7, num2 = 3, result;
		
		result = num1 + num2;
		System.out.println("덧셈 결과 : " + result );
		
		
		// 나머지 연산자 (%)
		System.out.println(12 % 5);  // 12 = 5 * 2 + 2
		System.out.println(12.1 % 3.0);  // 12.1 = 3.0 * 4 + 0.1 

		// 대입연산자도 연산자다! 따라서
		// 연산의 결과값이 있다.  대입된 값을 결과값으로 리턴함
		System.out.println(result = 100);
		
		
		result = num1 = num2 = 300;
		

		// 두개의 변수 값을 바꾸기(swap)
		System.out.println();
		int num3 = 100;
		int num4 = 200;
		int temp;     // 임시 변수 사용  (temporary)
		
		System.out.println("바꾸기전 num3 = " + num3 + " num4 = " + num4);
		
		temp = num3;
		num3 = num4;
		num4 = temp;
		System.out.println("바꾼후 num3 = " + num3 + " num4 = " + num4);
		
		
		double d1 = 3.14 / 0;
		System.out.println("d1 = " + d1);
		
		int num5 = 10 / 0;  // 정수 나눗셈 할때는 0으로 나누면 Exception 발생!
		System.out.println("num5 = " + num5);
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Operator01Main

/* 디버깅 (debugging)
 * - 버그(bug) : 프로그래머의 의도와는 다르게 동작(오동작) 하는 것. 
 * 
 *     ★ 디버깅 실력 = 프로그래밍 실력
 *     
 *     
 *    1. breakpoint 잡고  (프로그램 실행중 일시 중지 시킬 지점)
 *    2. 디버깅 명령을 통해 진행
 *    		- step over, step into, step out...
 *    3. 디버깅 진행하면서 확인할것들
 *    		- 프로그램의 흐름 
 *     		- 변수값의 내용
 *     		- 호출 관계...
 *    4. 디버깅 마친후에는 반드시 종료 (stop)
 * 
 */

















