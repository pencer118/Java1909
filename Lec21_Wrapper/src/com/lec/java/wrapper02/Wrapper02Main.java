package com.lec.java.wrapper02;

/* Java 5부터 wrapper 클래스의 auto-boxing/unboxing 기능 제공
 * 	boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
 * 	unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
 */
public class Wrapper02Main {

	public static void main(String[] args) {
		System.out.println("auto-boxing, auto-unboxing");

		Integer num1 = 10;  // Integer.valueOf(10); auto-boxing
		Integer num2 = 20;
		Integer num3 = num1 + num2;
		
		Integer num30 =  Integer.valueOf(num1.intValue() + num2.intValue()); 
		
		System.out.println("num3 = " + num3);
		
		
		System.out.println();
		System.out.println("boxing/unboxing");
		// boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
		// unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
		
		Integer num4 = Integer.valueOf(100);   //  boxing
		int n4 = num4.intValue();  // unboxing
		System.out.println("n4 = " + n4);
		
		
		System.out.println();
		System.out.println("auto-boxing/auto-unboxing");

		// TODO
		
		System.out.println();
		System.out.println("wrapper 클래스들");
		
		// TODO
		
		
	} // end main()

} // end class Wrapper02Main















