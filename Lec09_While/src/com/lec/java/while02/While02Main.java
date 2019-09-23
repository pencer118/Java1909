package com.lec.java.while02;

public class While02Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		int dan = 2;
		
		// 구구단 2단을 while 문을 사용해서 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ..
		// 2 x 9 = 18
		
		int n = 1; 
		while(n <= 9) {
			System.out.println(dan + " x " + n + " = " + (dan * n));
			n++;
		}
		
		// while <--> for 전환 가능
		for(n = 1; n <= 9; n++) {
			System.out.println(dan + " x " + n + " = " + (dan * n));
		}
		
		
		


	} // end main()

} // end class While02Main









