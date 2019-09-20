package com.lec.java.loop01;

/*
	 break;
	 순환문(for, while, do~while) 안에서 break를 만나면
	 break를 감싸는 가장 가까운 순환문 종료
 */
public class Loop01Main {

	public static void main(String[] args) {
		System.out.println("Break");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			// i 값이 3에 도달하면 종료
			if(i == 3) {
				break;
			}
		}
		
		System.out.println();
		// 2 와 7의 최소공배수를 출력하기
		// 최소공배수: 공배수중에서 가장 작은 수
		
		int a = 2, b = 7;
		int start = (a > b) ? a : b;
		
		for(int i = start; ;i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println("최소공배수는 " + i);
				break;
			}
		}
		
		
		
		
		
		
		
		
	} // end main()

} // end class Loop01Main









