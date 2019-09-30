package com.lec.java.method07;

/* Math 클래스의 메소드
 */
public class Method07Main {

	public static void main(String[] args) {
		System.out.println("Math 객체의 메소드");
		
		for(int i = 0; i < 10; i++) {
			double r = Math.random();   // 0.0 <=  r < 1.0 사이의 난수 발생(double)
			System.out.println(r);
		}
		
		
		// Math.floor(num) : num보다 작은 수중에 가장 큰 정수
		// Math.ceil(num)  : num보다 큰 수중에 가장 작은 정수
		// Math.round(num) : num 에서 반올림
		
		//  2.7
		// Math.floor(2.7)  --> 2
		// Math.ceil(2.7) --> 3.
		// Math.round(2.7) --> 3
		System.out.println(Math.floor(2.7));
		System.out.println(Math.ceil(2.7));
		System.out.println(Math.round(2.7));
		
		// -1.2
		System.out.println(Math.floor(-1.2)); // -2
		System.out.println(Math.ceil(-1.2));  // -1
		System.out.println(Math.round(-1.2)); // -1

		// -2.8
		System.out.println(Math.floor(-2.8)); // -3
		System.out.println(Math.ceil(-2.8));  // -2
		System.out.println(Math.round(-2.8)); // -3
		
		System.out.println();
		System.out.println(Math.abs(-23.54));  // 절대값
		System.out.println(Math.sqrt(9));   // 제곱근
		System.out.println(Math.PI);  // 원주율
		System.out.println(Math.E);    
		System.out.println(Math.sin(Math.PI / 2));
		System.out.println(Math.toDegrees(Math.PI / 2));
		
		System.out.println(Math.pow(5, 3));
		
		
		
		
		
		
		
		
		
		
	} // end main()

} // end class Method07Main









