package com.lec.java.if05;

/* 중첩된 if (nested-if) 문
 *   조건문 안의 조건문
 */
public class If05Main {

	public static void main(String[] args) {
		System.out.println("중첩된 if (nested-if) 문");
		
		int num = 37;

		// 짝수이면 '짝수'
		// 홀수이면 '홀수'
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
			// 4의 배수인지?
			if(num % 4 == 0) {
				System.out.println("4의 배수입니다");
			} else {
				System.out.println("짝수이지만 4의 배수는 아닙니다");
			}
			
		} else {
			System.out.println("홀수입니다");
			
			// 3의 배수인지?
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다");
			} else {
				System.out.println("홀수이지만 3의 배수는 아닙니다");
			}
		}
		
		
		
		
	} // end main()

} // end class If05Main


















