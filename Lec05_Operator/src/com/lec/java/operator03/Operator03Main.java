package com.lec.java.operator03;

/*
 	부호연산자(+, -) sign operator
 		+: 부호 연산자(수의 부호(양,음)가 바뀌지 않음)
 		-: 부호 연산자(수의 부호(양,음)가 바뀜)
 		
 		대표적인 단항연산자 (unary operator) : 피연산자가 하나만 필요한 연산자
 */
public class Operator03Main {

	public static void main(String[] args) {
		System.out.println("연산자 3 - 부호연산자(+, -) sign operator");
		int num1 = -10;
		int num2 = +num1;
		int num3 = -num1;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

	} // end main

} // end class Operator3Main
