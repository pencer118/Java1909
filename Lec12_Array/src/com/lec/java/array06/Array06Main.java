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
		
		
		int [] arrC = new int[] {11, 22, 33};
		int [] arrD = new int[] {77, 88, 99};
		
		System.out.println("arrC : " + Arrays.toString(arrC));
		System.out.println("arrD : " + Arrays.toString(arrD));
		
		arrC = arrD;   // 과연 무슨일이???
			// 원래 arrC가 reference 하던 {11, 22, 33} 은 
			// reference 가 끊기면서 garbage collecting 된다. (heap 에서 소멸)
		
		System.out.println("arrC : " + Arrays.toString(arrC));
		System.out.println("arrD : " + Arrays.toString(arrD));
		
		int[] arrE = {100, 200, 300};
		arrD = arrE;   // 과연???  {77,88,99} 는 소멸되었을까?

		System.out.println();
		System.out.println("arrC : " + Arrays.toString(arrC));
		System.out.println("arrD : " + Arrays.toString(arrD));
		System.out.println("arrE : " + Arrays.toString(arrE));

		
		
		
		
		

	} // end main()

} // end class Array06Main










