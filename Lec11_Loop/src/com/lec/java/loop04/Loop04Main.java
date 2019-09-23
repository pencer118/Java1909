package com.lec.java.loop04;

public class Loop04Main {

	public static void main(String[] args) {
		System.out.println("중첩 반복문과 break 연습");

		// 2단은 x 2까지만, 3단은 x 3까지... 9단은 x9까지만 출력하기
		for (int dan = 2; dan <= 9; dan++) {

			System.out.println(dan + "단");

			// 매 단마다 x1 ~ x9 순환
			for (int n = 1; n <= 9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				if(dan == n) break;
			}
			System.out.println();
		}

		System.out.println();
		
		for (int dan = 2; dan <= 9; dan++) {

			System.out.println(dan + "단");

			// 매 단마다 x1 ~ x9 순환
			for (int n = 1; n <= dan; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
			}
			System.out.println();
		}

	} // end main ()

} // end class Loop04Main
