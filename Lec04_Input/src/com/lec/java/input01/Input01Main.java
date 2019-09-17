package com.lec.java.input01;

import java.util.Scanner;

/* 표준입력 (Standard Input) : 키보드로부터 입력
 * Scanner 객체 사용
 */
public class Input01Main {

	public static void main(String[] args) {
		System.out.println("표준입력 : Scanner 사용");
		// CTRL + SHIFT + O  : auto-import
		Scanner sc = new Scanner(System.in);   // 키보드를 입력장치로 하는 Scanner 생성
		
		// sc 변수를 사용하여 키보드로부터 입력 처리.......
		int num1, num2;
		System.out.print("숫자1을 입력하세요: ");
		num1 = sc.nextInt();  // nextInt() 키보드로부터 정수 한개 입력 받아서 리턴(return)
		System.out.print("숫자2을 입력하세요: ");
		num2 = sc.nextInt();
		
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// 만약 nextInt() 에서 정수외의 글자 입력하면 InputMismatchException 발생
		
		// 각 primitive 타입에 대해 nextXXX() 메소드 제공
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextLong();
//		sc.nextDouble();
//		sc.nextFloat();
//		sc.nextBoolean();
		
		// Scanner 다 사용하면. 반.드.시 close() 해주어야 한다.		
		sc.close();

	} // end main

} // end class











