package com.lec.java.printformatted;

public class FormatPrintMain {

	public static void main(String[] args) {
		
		double pi = Math.PI;
		System.out.println(pi);
		
		// printf : print with format
		// printf("서식문자열", 값1, 값2....)
		// 서식문자열 안에 %로 시작하는 서식문자들..
		System.out.printf("원주율 %f\n", pi);
		System.out.printf("원주율 %.2f\n", pi);
		

	}

}
