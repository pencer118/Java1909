package com.lec.java.operator02;

/*
	복합 대입 연산자 compound assignment operators
	
		+=, -=, *=, /=, %=, ...
 */
public class Operator02Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 2 - 복합 대입 연산자 compound assignment operators");
		System.out.println("+=, -=, *=, /=, %=, ...");
		
		int num1 = 10;
		num1 = num1 + 2;
		System.out.println("num1 = " + num1);
		
		num1 += 2;   // num1 = num1 + 2  동일한 동작 
		System.out.println("num1 = " + num1);
		
		int num2 = 100;
		num2 -= 50;
		System.out.println("num2 = " + num2);
		
		double num3 = 3.14;
		num3 *= 2;
		System.out.println("num3 = " + num3);
		
		

		
	} // end main()

} // end class Operator2Main










