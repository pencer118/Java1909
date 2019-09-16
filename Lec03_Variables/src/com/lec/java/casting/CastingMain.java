package com.lec.java.casting;
/*
 * 형변환(casting)
 * 
 * 1.암묵적 형변환 (Implicit casting) : 자바 언어가 자동으로 해주는 형변환
 * 
 * 
 * 2.명시적 형변환 (Explicit casting)
 * 
 */
public class CastingMain {

	public static void main(String[] args) {
		System.out.println("형변환(Casting)");
		
		byte num1 = 123;
		
		int n = num1;
		
		int n2 = 123;
		//byte b2 = n2;
		
		// 명시적 형변환 : 프로그래머가 직접 타입 변환
		int n3 = 123;
		byte b3 = (byte)n3;
		System.out.println("b3 : " + b3);
		
		// 명시적 형변환시 자료손실 발생 가능 주의!
		int n4 = 513;
		byte b4 = (byte)n4;   // 1byte <- 4byte,  상위 3byte 손실
		System.out.println("b4 : " + b4);
		
		double avg1 = (99 + 88 + 78) / 3;
		double avg2 = (double)(99 + 88 + 78) / 3;
		
		System.out.println("avg1 = " + avg1);
		System.out.println("avg2 = " + avg2);

	}

}









