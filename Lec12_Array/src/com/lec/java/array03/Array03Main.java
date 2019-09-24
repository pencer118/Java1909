package com.lec.java.array03;

public class Array03Main {

	public static void main(String[] args) {
		System.out.println("여러가지 자료형의 배열");
		
		System.out.println();
		System.out.println("[1] double형 배열");
		// 타입[] 이름 = new 타입[배열 길이];
		// 타입[] 이름 = new 타입[] {a, b, ...};
		// 타입[] 이름 = {a, b, ...};

		double [] array1 = {1.2, 2.3, 3.4};
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		System.out.println();
		System.out.println("[2] char형 배열");
		
		char [] array2 = new char[5];
		array2[0] = 'a';
		array2[1] = 'b';
		array2[2] = 'c';
		array2[3] = '가';
		array2[4] = '9';
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		System.out.println();
		System.out.println("[3] boolean형 배열");

		boolean [] array3 = new boolean[4];
		
		// 0, 2 --> true
		// 1, 3 --> false
		for (int i = 0; i < array3.length; i++) {
			if(i % 2 == 0)
				array3[i] = true;
			else
				array3[i] = false;
		}
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		System.out.println();
		System.out.println("[4] String형의 배열");

		String [] array4 = new String[] {"Java", "C++", "HTML"};
		System.out.println(array4.length);
		
		for (int i = 0; i < array4.length; i++) {
			System.out.println(array4[i] + ":" + array4[i].length());
			// String 의 length() 는 문자의 개수
		}
		
		
	} // end main()

} // end class Array03Main



























