package com.lec.java.array06;

import java.util.Arrays;

/* 2차원 배열 의 length
	
 */
public class Array06Main {

	public static void main(String[] args) {
		System.out.println("reference type");
		
		int a = 10;
		int b = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		//-------
		int [] arrA = {10, 20, 30};
		
		// 배열을 '문자열' 로 출력
		// Arrays.toString(배열)
		System.out.println("A: " + Arrays.toString(arrA));
		
		int [] arrB = arrA;
		System.out.println("B: " + Arrays.toString(arrB));
		
		arrA[0] = 100;
		arrA[1] = 200;
		arrA[2] = 300;

		System.out.println("A배열 값 변경후?");
		System.out.println("A: " + Arrays.toString(arrA));
		System.out.println("B: " + Arrays.toString(arrB));
		
		
		System.out.println("arrA:" + arrA);
		System.out.println("arrB:" + arrB);
		
		
		
		

	} // end main()

} // end class Array06Main










