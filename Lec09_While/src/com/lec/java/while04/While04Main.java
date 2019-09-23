package com.lec.java.while04;

import java.util.Scanner;

public class While04Main {

	public static void main(String[] args) {
		System.out.println("while문 연습");
		
		// 사용자로부터 숫자(n) 입력받아서
		// 1 ~ n 까지 수중에서 홀수만 더한 결과를 출력 
		// while 문 사용
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;  
		while(i <= n) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
		
		sc.close();
		
	} // end main()

} // end class While04Main









