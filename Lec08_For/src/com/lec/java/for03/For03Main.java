package com.lec.java.for03;

public class For03Main {

	public static void main(String[] args) {
		System.out.println("for 연습");
	
		// 1 ~ 10 까지의 수 중에서 짝수만 출력해보세요
		// 2, 4, 6, 8, 10
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {				
				System.out.println(i);
			}
		}
		
		System.out.println("다른방법");
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		
		
		
		

	} // end main()

} // end class For03Main










