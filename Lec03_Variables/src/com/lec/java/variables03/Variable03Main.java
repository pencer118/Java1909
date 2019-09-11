package com.lec.java.variables03;

/* 자바의 기본자료형 (primitive data type)
 * 정수타입 : byte(1 byte), short (2 byte), int (4 byte), long (8 byte)
 * 실수타입 : float(4 byte), double(8 byte)
 * 문자타입 : char (2 byte)
 * 논리타입 : boolean
 */
public class Variable03Main {

	public static void main(String[] args) {
		System.out.println("변수 - 변수의 타입들");
		System.out.println("[1] 정수 타입 변수들");
		
		System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		
		byte num1 = -128;
		byte num2 = 0;
		byte num3 = 127;
		
		System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num4 = -12345;
		short num5 = 12345;
		//short num6 = 32768;
		
		System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		//int num7 = 9876543210;
		long num8 = 9876543210L;  // long 타입 리터럴 상수 만드려면 뒤에 L 붙이세요
		
		long num9 = 12;
		long num10 = 12L;
		int num11 = 12;
		//int num12 = 12L;  // long 타입 리터럴은 int 에 저장 못함
		
		int num15 = 20;
		System.out.println("num15 : " + num15);
		// 변수의 값을 1 증가 시키고 싶다면??
		num15 = num15 + 1;
		System.out.println("num15 (1증가후) : " + num15);
		
		// 정수타입은 값의 경계선에서 순환하는 구조 가진다
		int num16 = Integer.MAX_VALUE;
		System.out.println("num16 : " + num16);
		num16 = num16 + 1;
		System.out.println("num16 (1증가후) : " + num16);  // MIN_VALUE 값 !!
		
		
		
		

	} // end main()

} // end class











