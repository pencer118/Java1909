package com.lec.java.if01;

/* if, if ~ else 조건문
 * 
 * 구문1:
 * 	if (조건식) {
 *  	조건식이 true 일때 실행되는 문장(들) 
 *  	...
 * 	}
 * 
 * 구문2:
 *  if (조건식) {
 *		조건식이 true 일때 실행되는 문장(들)
 *		...
 *  } else {
 *		조건식이 false 일때 실행되는 문장(들)
 *		...
 *  }
 */
public class If01Main {

	public static void main(String[] args) {
		System.out.println("if 조건문");

		int num = -10;
		if(num > 0) {
			// if 조건문이 true 일때 수행되는 부분
			System.out.println("양수입니다");
		} // end if
		
		if(num < 0) {
			System.out.println("음수입니다");
		}
		
		num = 8;
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다");
		} else {
			// if 조건식이 false 일때 수행하는 블럭
			System.out.println("3의 배수가 아닙니다");
		}
		
		
		System.out.println("프로그램을 종료합니다");
	} // end main()

} // end class If01Main







