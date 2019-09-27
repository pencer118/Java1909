package com.lec.java.method02;

/* return 의 믜미
 * 
 *   1. 메소드를 호출한 곳으로 값을 리턴한다.
 *   2. 메소드 종료
 *   3. 메소드 정의시 명시한 리턴타입의 값이 반드시 리턴되어야 한다
 *          (혹은 리턴타입으로 형변환 가능한 값이..)
 */

public class Method02Main {

	public static void main(String[] args) {
		System.out.println("메소드의 리턴 타입");
		
		// void 리턴타입 메소드
		showResult(88);
		int total = 56;
		showResult(total);
		
		System.out.println();
		
		
		int r = add(110, 220);
		System.out.println("result = " + r);
		
		System.out.println("result = " + add(-200, -10));
		System.out.println("result = " + add(100, add(10, 20)));
		
		//add(1.0, 2.0);  // 불가
		add((int)1.0, (int)2.0);  // 가능
		
		int a = 100, b = 2;
		System.out.println(a + " * " + b + " = " + mul(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " / " + b + " = " + div(a, b));
		 
		
		
	} // end main()

	// 점수에 따라 '합격' '재도전' '실패' 출력해주는 메소드
	public static void showResult(double point) {
		if(point > 80) {
			System.out.println("합격");
			return;   // 메소드 종료하고 리턴
		}
		
		if(point > 70) {
			System.out.println("재도전");
			return;
		}
		
		System.out.println("실패");
		//return;  // void 타입 리턴하는 경우는 마지막 return은 생략해도 됨 (자동 리턴)
	} // end showReault()
	
	// 메소드 이름 : add
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입 : int
	public static int add(int x, int y) {
		int result = x + y;
		
		return result;   // int 값을 리턴
	}
	
	
	// 메소드 이름 : sub  (뺄셈 수행해서 리턴)
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입 : int
	public static int sub(int x, int y) {
		int result = x - y;
		
		return result;
	} // end sub()
	
	// 메소드 이름 : mul  (곱셈 수행해서 리턴)
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입 : int
	public static int mul(int x, int y) {
		return x * y;
	} // end multiply()


	// 메소드 이름 : div  (나눗셈 수행해서 리턴)
	// 매개변수:
	//   1) int x
	//   2) int y
	// 리턴타입 : int
	public static int div(int x, int y) {
		return x / y;
	} // end div()
	
	
	

} // end class Method02Main









