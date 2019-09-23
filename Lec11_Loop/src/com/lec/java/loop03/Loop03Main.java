package com.lec.java.loop03;

public class Loop03Main {

	public static void main(String[] args) {
		System.out.println("중첩 for 문 nested for");

		// 구구단 
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ..
		// 9 x 9 = 81
		
		// 단 : 2단 ~ 9단
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.println(dan + "단");
			
			// 매 단마다 x1 ~ x9 순환
			for(int n = 1; n <= 9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
			} 
			System.out.println();
		}
		
		System.out.println();
		// 위 구구단을 while문으로 출력해보세요
		
		int dan = 2;
		while(dan <= 9) {
			System.out.println(dan + "단");
			
			int n = 1; // x 1
			while(n <= 9) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				n++;
			}					
			
			System.out.println();
			dan++;
		}
		
		
		
		
		
	} // end main()

} // end class Loop03Main









