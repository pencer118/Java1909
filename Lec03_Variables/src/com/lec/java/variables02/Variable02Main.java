package com.lec.java.variables02;

public class Variable02Main {

	public static void main(String[] args) {
		System.out.println("변수 02");
		int num1 = 10; 
		System.out.println("num1 = " + num1);
		
		// int 타입의 변수 korean 을 선언하고, 초기화
		int korean = 50;
		// int 타입 변수, english, math 선언하고 초기화.
		int english = 100, math = 50;
		System.out.println("국어:" + korean);
		System.out.println("영어:" + english);
		System.out.println("수학:" + math);
		
		// 총점 계산
		System.out.println("총점:" + (korean + english + math));
		
		// 평균 계산
		System.out.println("평균:" + (korean + english + math) / 3. );
		System.out.println("평균:" + (double)(korean + english + math) / 3);
		
		

	} // end main

} // end class









