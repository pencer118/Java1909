package com.lec.java.variables04;

public class Variable04Main {

	public static void main(String[] args) {
		System.out.println("변수 - 실수 타입");
		
		// 실수타입 : float(4 byte), double(8 byte)
		
		double num1 = 3.141592;
		//float num2 = 3.141592;
		float num3 = 3.14f;  // f를 붙여주면 float 리터럴로 인식
		
		// 실수타입의 최소, 최대값
		System.out.println("float:" + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("double: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		float num4 = 1.23456789f;
		double num5 = 1.23456789;
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		// 실수 표기법
		double num6 = 123;
		double num7 = 1.23E2; // 지수(exponential)표기법
		System.out.println("num6: " + num6);
		System.out.println("num7: " + num7);
		
		double num8 = 0.0001213; 
		double num9 = 1.213e-4;
		System.out.println("num8: " + num8);
		System.out.println("num9: " + num9);
		
		
		

	} // end main()

} // end class












