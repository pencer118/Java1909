package com.lec.java.loop02;

/*
	 continue;
	 순환문(for, while, do~while) 안에서 continue   를 만나면
	 continue를 감싸는 가장 가까운 순환문 으로 돌아감
 */
public class Loop02Main {

	public static void main(String[] args) {
		System.out.println("continue;");
		
		int num = 1;
		
		while(num <= 10) {
			if(num % 2 == 0) {
				num++;
				continue;   
			}
			
			System.out.println(num);
			num++;			
		}
		
		
		

		
	} // end main

} // end class Loop02Main



















