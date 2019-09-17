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
		
		
		// format specifier (서식 지정자)
		//  %d  :  십진수 정수로 출력
		//  %f  :  실수 출력
		//  %s  :  문자열 출력
		//  %c  :  '문자하나' 출력
		//  %x  :  16진수 정수로 출력
		//  %%  :  % 출력
		
		int age = 10;
		short grade = 3;
		
		System.out.printf("제 나이는 %d살입니다. 학년은 %d학년입니다\n", age, grade);
		
		double height = 182.3;
		System.out.printf("저는 %d살입니다. 키는 %fcm입니다\n", age, height);
		System.out.printf("저는 %d살입니다. 키는 %.1fcm입니다\n", age, height);
		
		System.out.printf("%d%d%d\n",100,200,300);
		System.out.printf("%5d%5d%5d\n",100,200,300);
		System.out.printf("%-5d%-5d%-5d\n",100,200,300);
		
		System.out.printf("제 이름은 %s 입니다 혈액형은 %c형입니다\n", "김기덕", 'B');
		
		double rate = 123.0 / 345678.0;
		System.out.printf("합격률은 %f%%입니다", rate);
		
		

	}

}









