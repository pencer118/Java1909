package com.lec.java.wrapper01;

/* Wrapper 클래스: 기본 자료형(primitive type)의 데이터를 감싸는 클래스
 * 기본 자료형: boolean, char, byte, short, int, long, float, double
 * Wrapper: Boolean, Character, Byte, Short, Integer, Long, Float, Double
 */

public class Wrapper01Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스");
		System.out.println("wrapper 클래스에 값을 저장하는 방법");
		System.out.println();

		// 1. 생성자 이용
		Integer num1 = new Integer(123);
		System.out.println("num1 = " + num1);
		
		
		// 2. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용
		Integer num2 = Integer.valueOf(123);
		System.out.println("num2 = " + num2);
		
		if(num1 == num2) {
			System.out.println("같다..");
		} else {
			System.out.println("다르다!!");
		}
		
		if(num1.equals(num2)){
			System.out.println("같다..");
		} else {
			System.out.println("다르다!!");
		}
			
		// 3. new Integer() VS Integer.valueOf()
		Integer num3 = new Integer(123);
		Integer num4 = Integer.valueOf(123);
						// valueOf() Object 를 cache 해둔다.
						// 동일한 literal 로 생성하면 같은 Object 리턴
		
		if(num1 == num3) {
			System.out.println("생성자: 같은 참조");
		} else {
			System.out.println("생성자: 다른 주소");
		}
		
		
		if(num2 == num4) {
			System.out.println("valueOf(): 같은 참조");
		} else {
			System.out.println("valueOf(): 다른 참조");
		}
		
		
		// 4. literal 상수로 생성
		System.out.println();
		Integer num5 = 123;
		// Integer.valueOf(123) 과 동일한 코드가 작동. (auto-boxing)
		
		
		// 5. valueOf(문자열) 가능!
		System.out.println();
		Integer num6 = Integer.valueOf("123");
		System.out.println("num6 : " + num6);
		
		
		// 6. 산술 연산 가능
		num6 *= 2;
		System.out.println("num6 : " + num6);

		
	} // end main()

} // end class
















