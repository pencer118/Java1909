package com.lec.java.operator08;

/*
	 a & b: a,b가 모두 1 이면 결과도 1, 그 외에는 0
	 a | b: a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
	 a ^ b: a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
	        결국 둘이 같으면 0, 다르면 1 
	 ~a: a가 1이면 0, a가 0이면 1로 바꿔줌
*/
public class Operator08Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");
		
		
		byte n1 = 10;
		byte n2 = 7;
		System.out.printf("n1 : %8s\n", Integer.toBinaryString(n1));
		System.out.printf("n2 : %8s\n", Integer.toBinaryString(n2));
		
		int result = n1 & n2;  // bit 단위 연산
		System.out.println("result : " + result);
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		
		result = n1 | n2;
		System.out.println("result : " + result);
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		
		result = n1 ^ n2;  // xor
		System.out.println("result : " + result);
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		
		
		result = ~n1;  // not
		System.out.println("result : " + result);
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		
		System.out.println();
		System.out.println("비트 이동 (shift) 연산자 : >>, <<");
		int n3 = 10;
		result = n3 << 1;
		System.out.printf("n3 : %8s\n", Integer.toBinaryString(n3));
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		System.out.println("n3(10진) : " + n3);
		System.out.println("re(10진) : " + result);
		
		result = n3 >> 1;
		System.out.printf("n3 : %8s\n", Integer.toBinaryString(n3));
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		System.out.println("n3(10진) : " + n3);
		System.out.println("re(10진) : " + result);
		
		
		result = n3 << 3;
		System.out.printf("n3 : %8s\n", Integer.toBinaryString(n3));
		System.out.printf("re : %8s\n", Integer.toBinaryString(result));
		System.out.println("n3(10진) : " + n3);
		System.out.println("re(10진) : " + result);
		
		
		
	} // end main()

} // end class Operator8Main







