package com.lec.java.for04;

public class For04Main {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		// 1 ~ 100 숫자중에서, 2와 7의 공배수만 출력하기
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 && i % 7 == 0) {				
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		
		// 1 부터 10까지의 합을 계산
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println("1~10 합:" + sum);
		
		
		
	} // end main ()

} // end class For04Main










